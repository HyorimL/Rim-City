package com.yedam.lhr.voca;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yedam.lhr.common.DAO;

public class VocaDAOImpl extends DAO implements VocaDAO {

	
	//싱글톤
	private static VocaDAO instance = new VocaDAOImpl();
	private VocaDAOImpl() {}
	public static VocaDAO getInstance() {
		return instance;
	}
	
	
	//전체단어조회
	@Override
	public List<Vocabulary> selectAll() {
		List<Vocabulary> list = new ArrayList<>();
		
		try {
			connect();
			String select = "SELECT * FROM voca ORDER BY voca_no";
			pstmt = conn.prepareStatement(select);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Vocabulary voca = new Vocabulary();
				voca.setVocaNo(rs.getInt("voca_no"));
				voca.setVocaWord(rs.getString("voca_word"));
				voca.setVocaMean(rs.getString("voca_mean"));
				voca.setVocaLearn(rs.getInt("voca_learn"));
				
				list.add(voca);
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}

	
	//단건단어조회
	@Override
	public Vocabulary selectOne(String vocaWord) {
		Vocabulary voca = null;
		
		try {
			connect();
			String select = "SELECT * FROM voca WHERE voca_word = ?";
			pstmt = conn.prepareStatement(select);
			pstmt.setString(1, vocaWord);
			rs = pstmt.executeQuery();
			
			if(rs.next() ) {
				voca = new Vocabulary();
				voca.setVocaNo(rs.getInt("voca_no"));
				voca.setVocaWord(rs.getString("voca_word"));
				voca.setVocaMean(rs.getString("voca_mean"));
				voca.setVocaLearn(rs.getInt("voca_learn"));
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		
		return voca;
	}

	
	//단어등록
	@Override
	public void insert(Vocabulary voca) {
		try {
			connect();
			String insert = "INSERT INTO voca VALUES(?,?,?,?)";
			pstmt = conn.prepareStatement(insert);
			pstmt.setInt(1, voca.getVocaNo());
			pstmt.setString(2, voca.getVocaWord());
			pstmt.setString(3, voca.getVocaMean());
			pstmt.setInt(4, voca.getVocaLearn());
			
			int result = pstmt.executeUpdate();
			
			System.out.println(result + "건이 등록되었습니다.");
			
		} catch(SQLException e) {
			
		} finally {
			
		}

	}

	
	//단어수정
	@Override
	public void update(Vocabulary voca) {
		try {
			connect();
			String update = "UPDATE voca SET voca_mean = ? WHERE voca_word = ?";
			pstmt = conn.prepareStatement(update);
			pstmt.setString(1, voca.getVocaMean());
			pstmt.setString(2, voca.getVocaWord());
			
			int result = pstmt.executeUpdate();
			
			System.out.println(result + "건이 수정되었습니다.");
			
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

	
	//단어삭제
	@Override
	public void delete(String vocaWord) {
		 
		try {
			connect();
			String delete = "DELETE FROM voca WHERE voca_word = ?";
			pstmt = conn.prepareStatement(delete);
			pstmt.setString(1, vocaWord);
			
			int result = pstmt.executeUpdate();
			
			System.out.println(result + "건이 삭제되었습니다.");
			
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

}

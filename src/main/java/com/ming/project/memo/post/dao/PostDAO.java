package com.ming.project.memo.post.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.ming.project.memo.post.model.Post;

@Repository
public interface PostDAO {

	public int insertPost(
			@Param("userId") int userId
			, @Param("title") String title
			, @Param("content") String content
			, @Param("imagePath") String imagePath);
	
	public List<Post> selectPostList(@Param("userId") int userId);
	
	public Post selectPost(@Param("id") int id);
	
	public int updatePost(
			@Param("postId") int postId
			, @Param("title") String title
			, @Param("contents") String contents);
	
	public int deletePost(@Param("postId") int postId);
}

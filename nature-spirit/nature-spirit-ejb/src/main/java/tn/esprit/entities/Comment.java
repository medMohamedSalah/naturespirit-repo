package tn.esprit.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: Comment
 *
 */
@Entity
public class Comment implements Serializable {

	@EmbeddedId
	private CommentId commentId;
	private Integer Number_Of_Comment;
	private Integer Number_Of_Shares;
	private String Comment;

	@ManyToOne
	@JoinColumn(name = "id_Member", referencedColumnName = "id", updatable = false, insertable = false)
	private Member member;

	@ManyToOne
	@JoinColumn(name = "id_Article", referencedColumnName = "id", updatable = false, insertable = false)
	private Article article;

	private static final long serialVersionUID = 1L;

	public Comment() {
		super();
	}

	public Comment(Integer Number_Of_Comment,Integer Number_Of_Shares,String Comment,Member member,Article article) {
		super();
		this.Number_Of_Comment=Number_Of_Comment;
		this.Number_Of_Shares=Number_Of_Shares;
		this.Comment=Comment;
		this.member=member;
		this.article=article;
		this.commentId=new CommentId(member.getId_Member(),article.getId_Article());
	}

	public void setNumber_Of_Comment(Integer number_Of_Comment) {
		Number_Of_Comment = number_Of_Comment;
	}

	public Integer getNumber_Of_Comment() {
		return Number_Of_Comment;
	}

	public Integer getNumber_Of_Shares() {
		return Number_Of_Shares;
	}

	public void setNumber_Of_Shares(Integer number_Of_Shares) {
		Number_Of_Shares = number_Of_Shares;
	}

	public String getComment() {
		return this.Comment;
	}

	public void setComment(String Comment) {
		this.Comment = Comment;
	}

	public CommentId getCommentId() {
		return commentId;
	}

	public void setCommentId(CommentId commentId) {
		this.commentId = commentId;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

}

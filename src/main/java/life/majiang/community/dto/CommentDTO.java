package life.majiang.community.dto;

import life.majiang.community.model.User;
import lombok.Data;

@Data
public class CommentDTO {
    private Long id;
    private Long parentId;
    private Integer type;
    private Long commentator;
    private Long gmtCreate;
    private Long likeCount;
    private String content;
    private Long gmtModified;
    private User user;
}

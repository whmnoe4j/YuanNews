package cn.hpu.yuan.ssm.model.pojo;

import cn.hpu.yuan.ssm.model.vo.CommentVo;
import cn.hpu.yuan.ssm.model.vo.NewsVo;
import cn.hpu.yuan.ssm.model.vo.UserVo;

/**
 * Created by yuan on 16-4-4.
 * 新闻－评论－po实体
 */
public class CommentPo extends CommentVo{

    private UserVo userVo;
    private NewsVo newsVo;

    public UserVo getUserVo() {
        return userVo;
    }

    public void setUserVo(UserVo userVo) {
        this.userVo = userVo;
    }

    public NewsVo getNewsVo() {
        return newsVo;
    }

    public void setNewsVo(NewsVo newsVo) {
        this.newsVo = newsVo;
    }

    @Override
    public String toString() {
        return super.toString()+"CommentPo{" +
                "userVo=" + userVo +
                ", newsVo=" + newsVo +
                '}';
    }
}

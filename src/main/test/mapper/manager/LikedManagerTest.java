package mapper.manager;

import cn.hpu.yuan.ssm.mapper.manager.LikedManagerMapper;
import cn.hpu.yuan.ssm.model.pojo.LikedPo;
import common.MapperContanst;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by yuan on 16-4-4.
 * 后台管理　－　点赞管理　－　单元测试
 */
public class LikedManagerTest {

    private ApplicationContext context;
    private LikedManagerMapper likedManagerMapper;

    @Before
    public void setUp(){
        context=new ClassPathXmlApplicationContext(MapperContanst.APPLIACTION_CONTEXT_LOCATION);
        likedManagerMapper= (LikedManagerMapper) context.getBean("likedManagerMapper");
    }

    /**
     * 分页查询
     */
    @Test
    public void findLikeds() throws Exception{
        List<LikedPo> likeds = likedManagerMapper.findLikeds(0, 2);
        System.out.printf("点赞测试结果　："+likeds);
    }

    /**
     * 查询不到　ｎｕｌｌ， 查询结果为ｉｄ
     */
    @Test
    public void findLikedByNidUid() throws Exception{
        Integer id = likedManagerMapper.findLikedByNidUid(1, 2);
        System.out.printf("点赞测试结果　："+id);
    }


}

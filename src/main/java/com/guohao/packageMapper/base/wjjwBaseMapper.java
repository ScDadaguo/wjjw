package packageMapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import packageModel.wjjw;
/**
*  @author guohao
*/
public interface wjjwBaseMapper {

    int insertwjjw(wjjw object);

    int updatewjjw(wjjw object);

    int update(wjjw.UpdateBuilder object);

    List<wjjw> querywjjw(wjjw object);

    wjjw querywjjwLimit1(wjjw object);

}
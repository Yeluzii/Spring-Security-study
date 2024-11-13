package fun.ychen.mapper;

import fun.ychen.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author ychen
 * @since 2024-11-13
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}

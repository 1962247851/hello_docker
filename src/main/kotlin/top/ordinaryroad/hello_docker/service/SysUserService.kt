package top.ordinaryroad.hello_docker.service

import org.springframework.data.domain.Page
import top.ordinaryroad.hello_docker.entity.SysUserDO

/**
 * @author mjz
 * @date 2021/9/26
 */
interface SysUserService {

    fun list(page: Int, size: Int): Page<SysUserDO>

    fun insert(entity: SysUserDO): SysUserDO

}
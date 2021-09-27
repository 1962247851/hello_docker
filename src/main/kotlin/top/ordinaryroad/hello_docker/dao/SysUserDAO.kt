package top.ordinaryroad.hello_docker.dao

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import top.ordinaryroad.hello_docker.entity.SysUserDO

/**
 * @author mjz
 * @date 2021/9/26
 */
@Repository
interface SysUserDAO : JpaRepository<SysUserDO, Long>
package top.ordinaryroad.hello_docker.service.impl

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.stereotype.Service
import top.ordinaryroad.hello_docker.dao.SysUserDAO
import top.ordinaryroad.hello_docker.entity.SysUserDO
import top.ordinaryroad.hello_docker.service.SysUserService


/**
 *
 *
 * @author mjz
 * @date 2021/9/26
 */
@Service
class SysUserServiceImpl : SysUserService {

    @Autowired
    private lateinit var dao: SysUserDAO

    override fun list(page: Int, size: Int): Page<SysUserDO> {
        return dao.findAll(PageRequest.of(page, size))
    }

    override fun insert(entity: SysUserDO): SysUserDO {
        return dao.saveAndFlush(entity)
    }

}
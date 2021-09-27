package top.ordinaryroad.hello_docker.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import top.ordinaryroad.hello_docker.entity.SysUserDO
import top.ordinaryroad.hello_docker.service.SysUserService
import java.util.*

/**
 * @author mjz
 * @date 2021/9/26
 */
@RequestMapping("user")
@RestController
class SysUserController {

    @Autowired
    private lateinit var service: SysUserService

    @GetMapping("insert")
    fun insert(): SysUserDO {
        val sysUserDO = SysUserDO()
        sysUserDO.username = UUID.randomUUID().toString()
        return service.insert(sysUserDO)
    }


    @GetMapping("list")
    fun list(
        @RequestParam("page") page: Int,
        @RequestParam("size") size: Int
    ): Page<SysUserDO> {
        return service.list(page, size)
    }

}
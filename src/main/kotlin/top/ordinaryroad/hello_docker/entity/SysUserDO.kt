package top.ordinaryroad.hello_docker.entity

import org.springframework.data.annotation.CreatedDate
import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

/**
 * @author mjz
 * @date 2021/9/26
 */
@Entity
data class SysUserDO(
    @Id
    @GeneratedValue
    var id: Long?,
    var username: String?,
    @CreatedDate
    var createdTime: LocalDateTime?
) {
    constructor() : this(null, null, null)
}
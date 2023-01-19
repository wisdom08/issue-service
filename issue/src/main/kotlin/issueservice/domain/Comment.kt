package issueservice.domain

import jakarta.persistence.*

@Table
@Entity
class Comment(

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "issue_id")
    val issue: Issue,

    @Column
    var userId: Long,

    @Column
    val username: String,

    @Column
    var body: String,

    ) : BaseEntity()
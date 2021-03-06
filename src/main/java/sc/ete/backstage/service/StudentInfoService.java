package sc.ete.backstage.service;

import sc.ete.backstage.entity.StudentInfo;
import com.baomidou.mybatisplus.extension.service.IService;
import sc.ete.backstage.entity.VO.StudentInfoVO;

/**
 * <p>
 * 学生信息表 服务类
 * </p>
 *
 * @author arvin
 * @since 2022-03-18
 */
public interface StudentInfoService extends IService<StudentInfo> {

    void addStudentInfo(StudentInfoVO studentInfoVO);
}

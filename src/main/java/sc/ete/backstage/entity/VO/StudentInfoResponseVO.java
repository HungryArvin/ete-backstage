package sc.ete.backstage.entity.VO;

import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * @author ：Arvin
 * @Description:TODO
 * @name：StudentInfoResponseVO
 * @date ：2022/3/21 1:33
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class StudentInfoResponseVO {

    @ApiModelProperty(value = "自增ID")
    private Integer studentId;

    @ApiModelProperty(value = "学生名称")
    private String studentName;

    @ApiModelProperty(value = "学号")
    private String studentNum;

    @ApiModelProperty(value = "所在系别")
    private String department;

    @ApiModelProperty(value = "所在班级")
    private String className;

    @ApiModelProperty(value = "入学年份")
    private String level;

    @ApiModelProperty(value = "期末成绩")
    private int score;

    @ApiModelProperty(value = "平时成绩")
    private int qualityScore;

    @ApiModelProperty(value = "四级成绩")
    private int cetFour;

    @ApiModelProperty(value = "六级成绩")
    private int cetSix;

    @ApiModelProperty(value = "更新时间")
    private String updateTime;
}

package cn.iocoder.yudao.module.crm.controller.admin.receivable.vo;

import lombok.*;
import java.util.*;
import io.swagger.v3.oas.annotations.media.Schema;
import javax.validation.constraints.*;

@Schema(description = "管理后台 - CRM 回款计划创建 Request VO")
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class ReceivablePlanCreateReqVO extends ReceivablePlanBaseVO {

}
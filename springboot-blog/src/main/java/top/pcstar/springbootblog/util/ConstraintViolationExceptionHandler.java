package top.pcstar.springbootblog.util;

import org.apache.commons.lang3.StringUtils;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: PanChao
 * @Description: ConstraintViolationException 处理器
 * 处理Bean的校验异常信息，可能会有多个异常信息
 * @Date: Created in 16:24 2018/6/1
 */
public class ConstraintViolationExceptionHandler {

    /**
     * 获取批量异常信息
     *
     * @param e
     * @return
     */
    public static String getMessage(ConstraintViolationException e) {
        List<String> msgList = new ArrayList<>();
        for (ConstraintViolation<?> constraintViolation : e.getConstraintViolations()) {
            msgList.add(constraintViolation.getMessage());
        }
        String messages = StringUtils.join(msgList.toArray(), ";");
        return messages;
    }

}

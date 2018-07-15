package top.pcstar.springboothelloworld.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: PanChao
 * @Description: 全局捕获异常
 * @Date: Created in 10:31 2018/7/15
 */
//@ControllerAdvice
@RestControllerAdvice
public class GlobalExceptionHandle {
    @ExceptionHandler(RuntimeException.class)
//    @ResponseBody
    public Map<String, Object> resultError() {
        Map<String, Object> result = new HashMap<>();
        result.put("errorCode", "500");
        result.put("errorMsg", "系统错误");
        return result;
    }
}

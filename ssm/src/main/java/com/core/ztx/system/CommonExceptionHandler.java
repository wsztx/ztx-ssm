package com.core.ztx.system;

import static org.slf4j.LoggerFactory.getLogger;

import org.slf4j.Logger;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import com.core.ztx.comm.Constants;

@Order(1)
@ControllerAdvice
public class CommonExceptionHandler {
    Logger logger = getLogger(CommonExceptionHandler.class);

    @ExceptionHandler(Exception.class)
    public ModelAndView processValidationError(Exception ex) {
        logger.error("操作失败", ex);

        ModelAndView mav = new ModelAndView(Constants.SystemUrl.error.getUrl());
        mav.addObject("errorName", ex.getClass().getSimpleName());
        mav.addObject("errorMessage", ex.getMessage());
        return mav;
    }
}

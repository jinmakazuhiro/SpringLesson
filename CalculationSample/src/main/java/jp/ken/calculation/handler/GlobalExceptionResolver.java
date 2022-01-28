package jp.ken.calculation.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import jp.ken.calculation.exception.NegativeException;

@Component
public class GlobalExceptionResolver implements HandlerExceptionResolver {

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception ex) {

		ModelAndView model = new ModelAndView("error");

		if( ex.getClass() == NumberFormatException.class ) {
			model.addObject("error", "未入力もしくは整数以外の値では計算できません。");
		}else if( ex.getClass() == NegativeException.class ) {
			model.addObject("error", "未入力もしくは整数以外の値では計算できません。");
		}else if( ex.getClass() == ArithmeticException.class ) {
			model.addObject("error", "０で割算することはできません。");
		}
		model.addObject("url", "sample");
		return model;
	}

}

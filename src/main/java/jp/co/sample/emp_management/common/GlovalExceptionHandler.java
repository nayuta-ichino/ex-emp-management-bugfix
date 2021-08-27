package jp.co.sample.emp_management.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

/**
 * 500系のエラーを5xx.htmlへ遷移するクラス.
 * 
 * @author nayuta
 */
@Component
public class GlovalExceptionHandler implements HandlerExceptionResolver {
	// このクラスのログをLOGGERという定数に格納
	private static final Logger LOGGER = LoggerFactory.getLogger(GlovalExceptionHandler.class);

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object obj,
			Exception e) {
		LOGGER.error("システムエラーが発生しました。", e);

		// 自動的に[error/5xx.html]へ遷移
		return null;
	}

}

package com.bsn.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.bsn.service.LevelService;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jiusan
 * @since 2020-11-06
 */
@RestController
@RequestMapping("/level")
public class LevelController {
	@Autowired
	private LevelService levelService;
}

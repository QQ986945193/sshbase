package com.qq986945193.sshbase.service;

import java.util.List;

import com.qq986945193.sshbase.domain.Dict;

public interface DictService {

	List<Dict> findByCode(String dict_type_code);

}

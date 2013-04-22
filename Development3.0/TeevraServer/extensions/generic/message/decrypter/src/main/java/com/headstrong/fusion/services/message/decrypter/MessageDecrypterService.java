package com.headstrong.fusion.services.message.decrypter;

import com.headstrong.fusion.commons.MediationService;

public interface MessageDecrypterService extends MediationService{
	String ALGORITHM = "algorithm";
	String BLOCKMODE = "blockMode";
	String PADDING = "padding";
	String IVPARAMS = "ivParams";
	String KEY64 = "ket64";
	String BLOCKMODETYPE = "blockModeType";

}

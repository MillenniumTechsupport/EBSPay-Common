package com.ebspay.payments.auth.dto;

import com.ebspay.payments.auth.constants.EBSPayConstants;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseBodyDto<T> {
	

	private boolean success;
	
	private String msg;
	
	private int code;
	
	private T data;
	
	//success response
	public ResponseBodyDto(T data) {
        this.code = HttpStatus.OK.value();
        this.success = Boolean.TRUE;
        this.msg = EBSPayConstants.SUCCESS;
        this.data = data;
    }
	
	//error response
	public ResponseBodyDto(int errorCode, T data) {
        this.code = errorCode;
        this.success = Boolean.FALSE;
        this.msg = EBSPayConstants.FAILED;
        this.data = data;
    }

}



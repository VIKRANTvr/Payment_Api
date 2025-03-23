package com.payment_api.dto;

import java.util.List;
import java.util.Map;

public class GetServiceRequest {
	private Data data;

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {
		private Details details;
		private Us us;
		private List<Long> order_ids;
		private String request_method;
		private List<String> payment_mode;
		private String loopback_url;

		public Details getDetails() {
			return details;
		}

		public void setDetails(Details details) {
			this.details = details;
		}

		public Us getUs() {
			return us;
		}

		public void setUs(Us us) {
			this.us = us;
		}

		public List<Long> getOrder_ids() {
			return order_ids;
		}

		public void setOrder_ids(List<Long> order_ids) {
			this.order_ids = order_ids;
		}

		public String getRequest_method() {
			return request_method;
		}

		public void setRequest_method(String request_method) {
			this.request_method = request_method;
		}

		public List<String> getPayment_mode() {
			return payment_mode;
		}

		public void setPayment_mode(List<String> payment_mode) {
			this.payment_mode = payment_mode;
		}

		public String getLoopback_url() {
			return loopback_url;
		}

		public void setLoopback_url(String loopback_url) {
			this.loopback_url = loopback_url;
		}
	}

	public static class Details {
		private String user;
		private String in;
		private boolean in_flag;
		private String br_code;
		private String br_arn;
		private String partner_id;

		public String getUser() {
			return user;
		}

		public void setUser(String user) {
			this.user = user;
		}

		public String getIn() {
			return in;
		}

		public void setIn(String in) {
			this.in = in;
		}

		public boolean isIn_flag() {
			return in_flag;
		}

		public void setIn_flag(boolean in_flag) {
			this.in_flag = in_flag;
		}

		public String getBr_code() {
			return br_code;
		}

		public void setBr_code(String br_code) {
			this.br_code = br_code;
		}

		public String getBr_arn() {
			return br_arn;
		}

		public void setBr_arn(String br_arn) {
			this.br_arn = br_arn;
		}

		public String getPartner_id() {
			return partner_id;
		}

		public void setPartner_id(String partner_id) {
			this.partner_id = partner_id;
		}
	}

	public static class Us {
		private String code;

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}
	}
}

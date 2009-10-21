package cish_sys.dto;

import java.io.Serializable;

public class SelectListDto implements Serializable {

		private static final long serialVersionUID = 1L;

		private String label;

		private int value;

		public String getLabel() {
			return label;
		}

		public int getValue() {
			return value;
		}

		public void setLabel(String label) {
			this.label = label;
		}

		public void setValue(int value) {
			this.value = value;
		}
	}

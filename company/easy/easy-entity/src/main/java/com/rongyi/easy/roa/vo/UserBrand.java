package com.rongyi.easy.roa.vo;

import org.bson.types.ObjectId;

import java.io.Serializable;
import java.util.List;

/**
 * 用户品牌墙品牌VO
 *
 * @author  yaoyiwei
 * @date 2016-05-06
 * @version 1.0
 */
public class UserBrand implements Serializable {
    private static final long serialVersionUID = 1L;

    private String letter;

    private List<BrandInfo> brandInfo;

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    public List<BrandInfo> getBrandInfo() {
        return brandInfo;
    }

    public void setBrandInfo(List<BrandInfo> brandInfo) {
        this.brandInfo = brandInfo;
    }

    @Override
	public String toString() {
		return "UserBrand [letter=" + letter + ", brandInfo=" + brandInfo + "]";
	}

	public static class BrandInfo implements Serializable {
        private static final long serialVersionUID = 1L;
        // mongo id
        private String brandId;

        private String brandLogo;

        private String brandName;

        private String letter;
        
        private String ifSubmit;//0未提交 1已提交

        public String getIfSubmit() {
			return ifSubmit;
		}

		public void setIfSubmit(String ifSubmit) {
			this.ifSubmit = ifSubmit;
		}

		public String getBrandId() {
            return brandId;
        }

        public void setBrandId(String brandId) {
            this.brandId = brandId;
        }

        public String getBrandLogo() {
            return brandLogo;
        }

        public void setBrandLogo(String brandLogo) {
            this.brandLogo = brandLogo;
        }

        public String getBrandName() {
            return brandName;
        }

        public void setBrandName(String brandName) {
            this.brandName = brandName;
        }

        public String getLetter() {
            return letter;
        }

        public void setLetter(String letter) {
            this.letter = letter;
        }

		@Override
		public String toString() {
			return "BrandInfo [brandId=" + brandId + ", brandLogo=" + brandLogo
					+ ", brandName=" + brandName + ", letter=" + letter
					+ ", ifSubmit=" + ifSubmit + "]";
		}
    }


}
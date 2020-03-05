package com.cts.pojos;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ipos")
public class Ipos {
		
	    @Id
		private String id;
	    private String companyName;
        private String stockExchange;
        private String	priceperShare;
        private String totalnumberofShares;
        private String remarks;
        Date opendatetime=new Date();
		
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getCompanyName() {
			return companyName;
		}
		public void setCompanyName(String companyName) {
			this.companyName = companyName;
		}
		public String getStockExchange() {
			return stockExchange;
		}
		public void setStockExchange(String stockExchange) {
			this.stockExchange = stockExchange;
		}
		public String getPriceperShare() {
			return priceperShare;
		}
		public void setPriceperShare(String priceperShare) {
			this.priceperShare = priceperShare;
		}
		public String getTotalnumberofShares() {
			return totalnumberofShares;
		}
		public void setTotalnumberofShares(String totalnumberofShares) {
			this.totalnumberofShares = totalnumberofShares;
		}
		public String getRemarks() {
			return remarks;
		}
		public void setRemarks(String remarks) {
			this.remarks = remarks;
		}
		public Date getOpendatetime() {
			return opendatetime;
		}
		public void setOpendatetime(Date opendatetime) {
			this.opendatetime = opendatetime;
		}
		
        @Override
		public String toString() {
			return "Ipos [id=" + id + ", companyName=" + companyName + ", stockExchange=" + stockExchange
					+ ", priceperShare=" + priceperShare + ", totalnumberofShares=" + totalnumberofShares + ", remarks="
					+ remarks + ", opendatetime=" + opendatetime + "]";
		}
        }

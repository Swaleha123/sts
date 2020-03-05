package com.cts.pojos;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="managecompany")
public class Company {

	@Id
	private String companyName;
	private String turnover;
	private String ceo;
	private String boardofDirectors;
	private String listedinStockExchange;
	private String sector;
	private String brief;
	private String stockCode;
	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getTurnover() {
		return turnover;
	}
	public void setTurnover(String turnover) {
		this.turnover = turnover;
	}
	public String getCeo() {
		return ceo;
	}
	public void setCeo(String ceo) {
		this.ceo = ceo;
	}
	public String getBoardofDirectors() {
		return boardofDirectors;
	}
	public void setBoardofDirectors(String boardofDirectors) {
		this.boardofDirectors = boardofDirectors;
	}
	public String getListedinStockExchange() {
		return listedinStockExchange;
	}
	public void setListedinStockExchange(String listedinStockExchange) {
		this.listedinStockExchange = listedinStockExchange;
	}
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	public String getBrief() {
		return brief;
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}
	public String getStockCode() {
		return stockCode;
	}
	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}
	
	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", turnover=" + turnover + ", ceo=" + ceo + ", boardofDirectors="
				+ boardofDirectors + ", listedinStockExchange=" + listedinStockExchange + ", sector=" + sector
				+ ", brief=" + brief + ", stockCode=" + stockCode + "]";
	}

		}

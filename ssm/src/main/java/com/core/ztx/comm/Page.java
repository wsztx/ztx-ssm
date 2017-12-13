package com.core.ztx.comm;

import java.util.List;

/**
 * Created by Administrator on 2017/11/2.
 */
public class Page {

    private Integer total = new Integer(0);    //总记录数
    private Integer pageSize = new Integer(5);    //每页数量
    private Integer pageTotal = new Integer(1);     //总页数
    private Integer page = new Integer(1);    //当前页
    private Integer nextPage = new Integer(1);    //下一页
    private Integer previousPage = new Integer(1);      //上一页
    private Integer lastPage = new Integer(1);    //最后页码
    private List dataList;   //记录集合

    private Integer limitStart = new Integer(0);    //limit开始
    private Integer limitEnd = new Integer(this.pageSize);     //limit结束



	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageTotal() {
		return pageTotal;
	}

	public void setPageTotal(Integer pageTotal) {
		this.pageTotal = pageTotal;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getNextPage() {
		return nextPage;
	}

	public void setNextPage(Integer nextPage) {
		this.nextPage = nextPage;
	}

	public Integer getPreviousPage() {
		return previousPage;
	}

	public void setPreviousPage(Integer previousPage) {
		this.previousPage = previousPage;
	}

	public Integer getLastPage() {
		return lastPage;
	}

	public void setLastPage(Integer lastPage) {
		this.lastPage = lastPage;
	}

	public List getDataList() {
		return dataList;
	}

	public void setDataList(List dataList) {
		this.dataList = dataList;
	}

	public Integer getLimitStart() {
		return limitStart;
	}

	public void setLimitStart(Integer limitStart) {
		this.limitStart = limitStart;
	}

	public Integer getLimitEnd() {
		return limitEnd;
	}

	public void setLimitEnd(Integer limitEnd) {
		this.limitEnd = limitEnd;
	}

	public void doPageBefore(Integer pageSize){
        this.pageSize = pageSize;
        this.page = (this.page==null || this.page<=0)?1:this.page;
        this.limitStart = ((this.page-1)*this.pageSize)<=0?0:((this.page-1)*this.pageSize);
        this.limitEnd = this.pageSize;
    }

    public void doPageAfter(List dataList, Integer total){
        this.total = total;
        this.pageTotal = this.total%this.pageSize==0?(this.total/this.pageSize==0?1:this.total/this.pageSize):(this.total/this.pageSize+1);
        this.lastPage = this.pageTotal;
        this.previousPage = this.page<=1?1:(this.page-1);
        this.nextPage = this.page>=this.lastPage?this.lastPage:(this.page+1);
        this.dataList = dataList;
    }
}

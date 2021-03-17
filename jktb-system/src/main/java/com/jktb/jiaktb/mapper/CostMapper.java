package com.jktb.jiaktb.mapper;

import java.util.List;
import com.jktb.jiaktb.domain.Cost;

/**
 * 学费明细Mapper接口
 * 
 * @author jktb
 * @date 2021-03-15
 */
public interface CostMapper 
{
    /**
     * 查询学费明细
     * 
     * @param costId 学费明细ID
     * @return 学费明细
     */
    public Cost selectCostById(Long costId);

    /**
     * 查询学费明细列表
     * 
     * @param cost 学费明细
     * @return 学费明细集合
     */
    public List<Cost> selectCostList(Cost cost);

    /**
     * 新增学费明细
     * 
     * @param cost 学费明细
     * @return 结果
     */
    public int insertCost(Cost cost);

    /**
     * 修改学费明细
     * 
     * @param cost 学费明细
     * @return 结果
     */
    public int updateCost(Cost cost);

    /**
     * 删除学费明细
     * 
     * @param costId 学费明细ID
     * @return 结果
     */
    public int deleteCostById(Long costId);

    /**
     * 批量删除学费明细
     * 
     * @param costIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteCostByIds(Long[] costIds);
}

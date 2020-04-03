package  com.cris.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.cris.model.Join6;
import com.cris.model.Terminal;


@Repository
public interface TerminalRepository extends JpaRepository<Terminal,Integer>{

	
	@Query("SELECT new com.cris.model.Join6(ptd.posTrmlUid,ptd.terminalId,ptd.terminalTypeId,ptd.locationId,ptd.validFrom,ptd.validUpto,ptd.validStatus,ptd.updatedBy,ptd.updatedOn,pd.posKey,pd.mid,pd.posTid,pd.posMac,pd.posMake,pd.posBankCode,pd.serviceProviderCode,t.terminalCode,t.trmlSrvNumber,t.windowNumber,t.adminId,t.terminalIp,t.trmlSrvType,t.commissionDate,tm.terminalTimingUid,tm.appId,tm.usageFrequencyType,tm.usageFrequencyValue,tm.startDate,tm.endDate,tm.startTime,tm.endTime,ta.trmlAppLocParamUid,ta.terminalParameterUid,tp.paramType,tp.name, tp.value, tp.description, tp.serialNumber) "
			+ "FROM PosTrmlDetails ptd,PosDetails pd,Terminal t,TerminalTiming tm ,TerminalAppLocParam ta,MasterTerminalParameter tp WHERE ptd.posKey=pd.posKey AND ptd.terminalId=t.terminalId AND tm.terminalId=t.terminalId AND ta.terminalId=t.terminalId AND ta.terminalParameterUid=tp.terminalParameterUid")
	List<Join6> fetchJoin_Join6();

	Optional<Terminal> findById(Integer id);
    
    
}

	
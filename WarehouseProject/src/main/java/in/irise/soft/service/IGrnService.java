package in.irise.soft.service;

import java.util.List;
import java.util.Optional;

import in.irise.soft.model.Grn;
import in.irise.soft.model.GrnDtl;

public interface IGrnService {

	String saveGrn(Grn grn);
	List<Grn> getAllGrns();
	Optional<Grn> getOneGrn(Integer grnId);
	//screen#2
	void saveGrnDtl(GrnDtl dtl);
	List<GrnDtl> getAllGrnDtlByGrnId(Integer id);
	void updateGrnDtlStatusById(String status, Integer dtlId);	
}

package pe.edu.utp.BibMpch.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pe.edu.utp.BibMpch.model.District;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DistrictDTO {
    private Long id;
    private Long province;
    private String districtName;

    public DistrictDTO(District d) {
        this.id = d.getId();
        this.province = d.getProvince().getId();
        this.districtName = d.getDistrictName();
    }
}
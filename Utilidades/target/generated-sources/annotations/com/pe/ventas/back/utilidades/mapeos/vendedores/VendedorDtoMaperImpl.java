package com.pe.ventas.back.utilidades.mapeos.vendedores;

import com.pe.ventas.back.dtos.daos.sql.vendedores.VendedorSqlDto;
import com.pe.ventas.back.dtos.daos.vendedores.VendedorDaoDto;
import com.pe.ventas.back.dtos.rest.vendedores.VendedorRestDto;
import com.pe.ventas.back.dtos.servicios.vendedores.VendedorServicioDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
public class VendedorDtoMaperImpl implements VendedorDtoMaper {

    @Override
    public VendedorDaoDto vendedorSqlDtoAVendedorDaoDto(VendedorSqlDto vendedor) {
        if ( vendedor == null ) {
            return null;
        }

        VendedorDaoDto vendedorDaoDto = new VendedorDaoDto();

        vendedorDaoDto.setCodigo( vendedor.getVendedorCodigo() );
        vendedorDaoDto.setVendedorNombre1( vendedor.getVendedorNombre1() );
        vendedorDaoDto.setVendedorNombre2( vendedor.getVendedorNombre2() );
        vendedorDaoDto.setVendedorApepat( vendedor.getVendedorApepat() );
        vendedorDaoDto.setVendedorApemat( vendedor.getVendedorApemat() );
        vendedorDaoDto.setVendedorDocid( vendedor.getVendedorDocid() );
        vendedorDaoDto.setVendedorDireccion( vendedor.getVendedorDireccion() );
        vendedorDaoDto.setVendedorCelular1( vendedor.getVendedorCelular1() );
        vendedorDaoDto.setVendedorCelular2( vendedor.getVendedorCelular2() );
        vendedorDaoDto.setUsuarioCodigo( vendedor.getUsuarioCodigo() );
        vendedorDaoDto.setVendedorComentado( vendedor.getVendedorComentado() );
        vendedorDaoDto.setVendedorEstado( vendedor.getVendedorEstado() );
        vendedorDaoDto.setVendedorFecre( vendedor.getVendedorFecre() );
        vendedorDaoDto.setVendedorHocre( vendedor.getVendedorHocre() );
        vendedorDaoDto.setVendedorUscre( vendedor.getVendedorUscre() );
        vendedorDaoDto.setVendedorFemod( vendedor.getVendedorFemod() );
        vendedorDaoDto.setVendedorHomod( vendedor.getVendedorHomod() );
        vendedorDaoDto.setVendedorUsmod( vendedor.getVendedorUsmod() );

        return vendedorDaoDto;
    }

    @Override
    public VendedorSqlDto vendedorDaoDtoAVendedorSqlDto(VendedorDaoDto vendedor) {
        if ( vendedor == null ) {
            return null;
        }

        VendedorSqlDto vendedorSqlDto = new VendedorSqlDto();

        vendedorSqlDto.setVendedorCodigo( vendedor.getCodigo() );
        vendedorSqlDto.setVendedorNombre1( vendedor.getVendedorNombre1() );
        vendedorSqlDto.setVendedorNombre2( vendedor.getVendedorNombre2() );
        vendedorSqlDto.setVendedorApepat( vendedor.getVendedorApepat() );
        vendedorSqlDto.setVendedorApemat( vendedor.getVendedorApemat() );
        vendedorSqlDto.setVendedorDocid( vendedor.getVendedorDocid() );
        vendedorSqlDto.setVendedorDireccion( vendedor.getVendedorDireccion() );
        vendedorSqlDto.setVendedorCelular1( vendedor.getVendedorCelular1() );
        vendedorSqlDto.setVendedorCelular2( vendedor.getVendedorCelular2() );
        vendedorSqlDto.setUsuarioCodigo( vendedor.getUsuarioCodigo() );
        vendedorSqlDto.setVendedorComentado( vendedor.getVendedorComentado() );
        vendedorSqlDto.setVendedorEstado( vendedor.getVendedorEstado() );
        vendedorSqlDto.setVendedorFecre( vendedor.getVendedorFecre() );
        vendedorSqlDto.setVendedorHocre( vendedor.getVendedorHocre() );
        vendedorSqlDto.setVendedorUscre( vendedor.getVendedorUscre() );
        vendedorSqlDto.setVendedorFemod( vendedor.getVendedorFemod() );
        vendedorSqlDto.setVendedorHomod( vendedor.getVendedorHomod() );
        vendedorSqlDto.setVendedorUsmod( vendedor.getVendedorUsmod() );

        return vendedorSqlDto;
    }

    @Override
    public VendedorDaoDto vendedorServicioDtoAVendedorDaoDto(VendedorServicioDto vendedor) {
        if ( vendedor == null ) {
            return null;
        }

        VendedorDaoDto vendedorDaoDto = new VendedorDaoDto();

        vendedorDaoDto.setCodigo( vendedor.getCodigo() );
        vendedorDaoDto.setVendedorNombre1( vendedor.getVendedorNombre1() );
        vendedorDaoDto.setVendedorNombre2( vendedor.getVendedorNombre2() );
        vendedorDaoDto.setVendedorApepat( vendedor.getVendedorApepat() );
        vendedorDaoDto.setVendedorApemat( vendedor.getVendedorApemat() );
        vendedorDaoDto.setVendedorDocid( vendedor.getVendedorDocid() );
        vendedorDaoDto.setVendedorDireccion( vendedor.getVendedorDireccion() );
        vendedorDaoDto.setVendedorCelular1( vendedor.getVendedorCelular1() );
        vendedorDaoDto.setVendedorCelular2( vendedor.getVendedorCelular2() );
        vendedorDaoDto.setUsuarioCodigo( vendedor.getUsuarioCodigo() );
        vendedorDaoDto.setVendedorComentado( vendedor.getVendedorComentado() );
        vendedorDaoDto.setVendedorEstado( vendedor.getVendedorEstado() );
        vendedorDaoDto.setVendedorFecre( vendedor.getVendedorFecre() );
        vendedorDaoDto.setVendedorHocre( vendedor.getVendedorHocre() );
        vendedorDaoDto.setVendedorUscre( vendedor.getVendedorUscre() );
        vendedorDaoDto.setVendedorFemod( vendedor.getVendedorFemod() );
        vendedorDaoDto.setVendedorHomod( vendedor.getVendedorHomod() );
        vendedorDaoDto.setVendedorUsmod( vendedor.getVendedorUsmod() );

        return vendedorDaoDto;
    }

    @Override
    public VendedorServicioDto vendedorDaoDtoAVendedorServicioDto(VendedorDaoDto vendedor) {
        if ( vendedor == null ) {
            return null;
        }

        VendedorServicioDto vendedorServicioDto = new VendedorServicioDto();

        vendedorServicioDto.setCodigo( vendedor.getCodigo() );
        vendedorServicioDto.setVendedorNombre1( vendedor.getVendedorNombre1() );
        vendedorServicioDto.setVendedorNombre2( vendedor.getVendedorNombre2() );
        vendedorServicioDto.setVendedorApepat( vendedor.getVendedorApepat() );
        vendedorServicioDto.setVendedorApemat( vendedor.getVendedorApemat() );
        vendedorServicioDto.setVendedorDocid( vendedor.getVendedorDocid() );
        vendedorServicioDto.setVendedorDireccion( vendedor.getVendedorDireccion() );
        vendedorServicioDto.setVendedorCelular1( vendedor.getVendedorCelular1() );
        vendedorServicioDto.setVendedorCelular2( vendedor.getVendedorCelular2() );
        vendedorServicioDto.setUsuarioCodigo( vendedor.getUsuarioCodigo() );
        vendedorServicioDto.setVendedorComentado( vendedor.getVendedorComentado() );
        vendedorServicioDto.setVendedorEstado( vendedor.getVendedorEstado() );
        vendedorServicioDto.setVendedorFecre( vendedor.getVendedorFecre() );
        vendedorServicioDto.setVendedorHocre( vendedor.getVendedorHocre() );
        vendedorServicioDto.setVendedorUscre( vendedor.getVendedorUscre() );
        vendedorServicioDto.setVendedorFemod( vendedor.getVendedorFemod() );
        vendedorServicioDto.setVendedorHomod( vendedor.getVendedorHomod() );
        vendedorServicioDto.setVendedorUsmod( vendedor.getVendedorUsmod() );

        return vendedorServicioDto;
    }

    @Override
    public VendedorServicioDto vendedorRestDtoAVendedorServicioDto(VendedorRestDto vendedor) {
        if ( vendedor == null ) {
            return null;
        }

        VendedorServicioDto vendedorServicioDto = new VendedorServicioDto();

        vendedorServicioDto.setCodigo( vendedor.getCodigo() );
        vendedorServicioDto.setVendedorNombre1( vendedor.getVendedorNombre1() );
        vendedorServicioDto.setVendedorNombre2( vendedor.getVendedorNombre2() );
        vendedorServicioDto.setVendedorApepat( vendedor.getVendedorApepat() );
        vendedorServicioDto.setVendedorApemat( vendedor.getVendedorApemat() );
        vendedorServicioDto.setVendedorDocid( vendedor.getVendedorDocid() );
        vendedorServicioDto.setVendedorDireccion( vendedor.getVendedorDireccion() );
        vendedorServicioDto.setVendedorCelular1( vendedor.getVendedorCelular1() );
        vendedorServicioDto.setVendedorCelular2( vendedor.getVendedorCelular2() );
        vendedorServicioDto.setUsuarioCodigo( vendedor.getUsuarioCodigo() );
        vendedorServicioDto.setVendedorComentado( vendedor.getVendedorComentado() );
        vendedorServicioDto.setVendedorEstado( vendedor.getVendedorEstado() );
        vendedorServicioDto.setVendedorFecre( vendedor.getVendedorFecre() );
        vendedorServicioDto.setVendedorHocre( vendedor.getVendedorHocre() );
        vendedorServicioDto.setVendedorUscre( vendedor.getVendedorUscre() );
        vendedorServicioDto.setVendedorFemod( vendedor.getVendedorFemod() );
        vendedorServicioDto.setVendedorHomod( vendedor.getVendedorHomod() );
        vendedorServicioDto.setVendedorUsmod( vendedor.getVendedorUsmod() );

        return vendedorServicioDto;
    }

    @Override
    public VendedorRestDto vendedorServicioDtoAVendedorRestDto(VendedorServicioDto vendedor) {
        if ( vendedor == null ) {
            return null;
        }

        VendedorRestDto vendedorRestDto = new VendedorRestDto();

        vendedorRestDto.setCodigo( vendedor.getCodigo() );
        vendedorRestDto.setVendedorNombre1( vendedor.getVendedorNombre1() );
        vendedorRestDto.setVendedorNombre2( vendedor.getVendedorNombre2() );
        vendedorRestDto.setVendedorApepat( vendedor.getVendedorApepat() );
        vendedorRestDto.setVendedorApemat( vendedor.getVendedorApemat() );
        vendedorRestDto.setVendedorDocid( vendedor.getVendedorDocid() );
        vendedorRestDto.setVendedorDireccion( vendedor.getVendedorDireccion() );
        vendedorRestDto.setVendedorCelular1( vendedor.getVendedorCelular1() );
        vendedorRestDto.setVendedorCelular2( vendedor.getVendedorCelular2() );
        vendedorRestDto.setUsuarioCodigo( vendedor.getUsuarioCodigo() );
        vendedorRestDto.setVendedorComentado( vendedor.getVendedorComentado() );
        vendedorRestDto.setVendedorEstado( vendedor.getVendedorEstado() );
        vendedorRestDto.setVendedorFecre( vendedor.getVendedorFecre() );
        vendedorRestDto.setVendedorHocre( vendedor.getVendedorHocre() );
        vendedorRestDto.setVendedorUscre( vendedor.getVendedorUscre() );
        vendedorRestDto.setVendedorFemod( vendedor.getVendedorFemod() );
        vendedorRestDto.setVendedorHomod( vendedor.getVendedorHomod() );
        vendedorRestDto.setVendedorUsmod( vendedor.getVendedorUsmod() );

        return vendedorRestDto;
    }

    @Override
    public List<VendedorRestDto> convertirListaVendedorServicioDtoAVendedorRestDto(List<VendedorServicioDto> vendedor) {
        if ( vendedor == null ) {
            return null;
        }

        List<VendedorRestDto> list = new ArrayList<VendedorRestDto>( vendedor.size() );
        for ( VendedorServicioDto vendedorServicioDto : vendedor ) {
            list.add( vendedorServicioDtoAVendedorRestDto( vendedorServicioDto ) );
        }

        return list;
    }

    @Override
    public List<VendedorDaoDto> convertirListaVendedorSqlDtoAVendedorDaoDto(List<VendedorSqlDto> vendedor) {
        if ( vendedor == null ) {
            return null;
        }

        List<VendedorDaoDto> list = new ArrayList<VendedorDaoDto>( vendedor.size() );
        for ( VendedorSqlDto vendedorSqlDto : vendedor ) {
            list.add( vendedorSqlDtoAVendedorDaoDto( vendedorSqlDto ) );
        }

        return list;
    }

    @Override
    public List<VendedorSqlDto> convertirListaVendedorDaoDtoAVendedorSqlDto(List<VendedorDaoDto> vendedor) {
        if ( vendedor == null ) {
            return null;
        }

        List<VendedorSqlDto> list = new ArrayList<VendedorSqlDto>( vendedor.size() );
        for ( VendedorDaoDto vendedorDaoDto : vendedor ) {
            list.add( vendedorDaoDtoAVendedorSqlDto( vendedorDaoDto ) );
        }

        return list;
    }

    @Override
    public List<VendedorServicioDto> convertirListaVendedorDaoDtoAVendedorServicioDto(List<VendedorDaoDto> vendedor) {
        if ( vendedor == null ) {
            return null;
        }

        List<VendedorServicioDto> list = new ArrayList<VendedorServicioDto>( vendedor.size() );
        for ( VendedorDaoDto vendedorDaoDto : vendedor ) {
            list.add( vendedorDaoDtoAVendedorServicioDto( vendedorDaoDto ) );
        }

        return list;
    }
}

package com.pe.ventas.back.utilidades.mapeos.almacenvendedor;

import com.pe.ventas.back.dtos.daos.almacenvendedor.AlmacenVendedorDaoDto;
import com.pe.ventas.back.dtos.daos.sql.almacenvendedor.AlmacenVendedorSqlDto;
import com.pe.ventas.back.dtos.rest.almacenvendedor.AlmacenVendedorRestDto;
import com.pe.ventas.back.dtos.servicios.almacenvendedor.AlmacenVendedorServicioDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
public class AlmacenVendedorDtoMaperImpl implements AlmacenVendedorDtoMaper {

    @Override
    public AlmacenVendedorDaoDto AlmacenVendedorSqlDtoAAlmacenVendedorDaoDTo(AlmacenVendedorSqlDto almacenVendedor) {
        if ( almacenVendedor == null ) {
            return null;
        }

        AlmacenVendedorDaoDto almacenVendedorDaoDto = new AlmacenVendedorDaoDto();

        almacenVendedorDaoDto.setCodAlmacen( almacenVendedor.getAlmacenCodigo() );
        almacenVendedorDaoDto.setCodVendedor( almacenVendedor.getVendedorCodigo() );
        almacenVendedorDaoDto.setAlmacenVendedorEstado( almacenVendedor.getAlmacenVendedorEstado() );

        return almacenVendedorDaoDto;
    }

    @Override
    public AlmacenVendedorSqlDto AlmacenVendedorDaoDtoAAlmacenVendedorSqlDto(AlmacenVendedorDaoDto almacenVendedor) {
        if ( almacenVendedor == null ) {
            return null;
        }

        AlmacenVendedorSqlDto almacenVendedorSqlDto = new AlmacenVendedorSqlDto();

        almacenVendedorSqlDto.setAlmacenCodigo( almacenVendedor.getCodAlmacen() );
        almacenVendedorSqlDto.setVendedorCodigo( almacenVendedor.getCodVendedor() );
        almacenVendedorSqlDto.setAlmacenVendedorEstado( almacenVendedor.getAlmacenVendedorEstado() );

        return almacenVendedorSqlDto;
    }

    @Override
    public AlmacenVendedorDaoDto AlmacenVendedorServicioDtoAAlmacenVendedorDaoDto(AlmacenVendedorServicioDto almacenVendedor) {
        if ( almacenVendedor == null ) {
            return null;
        }

        AlmacenVendedorDaoDto almacenVendedorDaoDto = new AlmacenVendedorDaoDto();

        almacenVendedorDaoDto.setCodAlmacen( almacenVendedor.getCodAlmacen() );
        almacenVendedorDaoDto.setCodVendedor( almacenVendedor.getCodVendedor() );
        almacenVendedorDaoDto.setAlmacenVendedorEstado( almacenVendedor.getAlmacenVendedorEstado() );

        return almacenVendedorDaoDto;
    }

    @Override
    public AlmacenVendedorServicioDto AlmacenVendedorDaoDtoAAlmacenVendedorServicioDto(AlmacenVendedorDaoDto almacenVendedor) {
        if ( almacenVendedor == null ) {
            return null;
        }

        AlmacenVendedorServicioDto almacenVendedorServicioDto = new AlmacenVendedorServicioDto();

        almacenVendedorServicioDto.setCodAlmacen( almacenVendedor.getCodAlmacen() );
        almacenVendedorServicioDto.setCodVendedor( almacenVendedor.getCodVendedor() );
        almacenVendedorServicioDto.setAlmacenVendedorEstado( almacenVendedor.getAlmacenVendedorEstado() );

        return almacenVendedorServicioDto;
    }

    @Override
    public AlmacenVendedorServicioDto AlmacenVendedorRestDtoAAlmacenVendedorServicioDto(AlmacenVendedorRestDto almacenVendedor) {
        if ( almacenVendedor == null ) {
            return null;
        }

        AlmacenVendedorServicioDto almacenVendedorServicioDto = new AlmacenVendedorServicioDto();

        almacenVendedorServicioDto.setCodAlmacen( almacenVendedor.getCodAlmacen() );
        almacenVendedorServicioDto.setCodVendedor( almacenVendedor.getCodVendedor() );
        almacenVendedorServicioDto.setAlmacenVendedorEstado( almacenVendedor.getAlmacenVendedorEstado() );

        return almacenVendedorServicioDto;
    }

    @Override
    public AlmacenVendedorRestDto AlmacenVendedorServicioDtoAAlmacenVendedorRestDto(AlmacenVendedorServicioDto almacenVendedor) {
        if ( almacenVendedor == null ) {
            return null;
        }

        AlmacenVendedorRestDto almacenVendedorRestDto = new AlmacenVendedorRestDto();

        almacenVendedorRestDto.setCodAlmacen( almacenVendedor.getCodAlmacen() );
        almacenVendedorRestDto.setCodVendedor( almacenVendedor.getCodVendedor() );
        almacenVendedorRestDto.setAlmacenVendedorEstado( almacenVendedor.getAlmacenVendedorEstado() );

        return almacenVendedorRestDto;
    }

    @Override
    public List<AlmacenVendedorRestDto> convertirListaAlmacenVendedorServicioDtoAlmacenVendedorRestDto(List<AlmacenVendedorServicioDto> almacenVendedor) {
        if ( almacenVendedor == null ) {
            return null;
        }

        List<AlmacenVendedorRestDto> list = new ArrayList<AlmacenVendedorRestDto>( almacenVendedor.size() );
        for ( AlmacenVendedorServicioDto almacenVendedorServicioDto : almacenVendedor ) {
            list.add( AlmacenVendedorServicioDtoAAlmacenVendedorRestDto( almacenVendedorServicioDto ) );
        }

        return list;
    }

    @Override
    public List<AlmacenVendedorDaoDto> convertirListaAlmacenVendedorSqlDtoAAlmacenVendedorDaoDto(List<AlmacenVendedorSqlDto> almacenVendedor) {
        if ( almacenVendedor == null ) {
            return null;
        }

        List<AlmacenVendedorDaoDto> list = new ArrayList<AlmacenVendedorDaoDto>( almacenVendedor.size() );
        for ( AlmacenVendedorSqlDto almacenVendedorSqlDto : almacenVendedor ) {
            list.add( AlmacenVendedorSqlDtoAAlmacenVendedorDaoDTo( almacenVendedorSqlDto ) );
        }

        return list;
    }

    @Override
    public List<AlmacenVendedorSqlDto> convertirListaAlmacenVendedorDaoDtoAAlmacenVendedorSqlDto(List<AlmacenVendedorDaoDto> almacenVendedor) {
        if ( almacenVendedor == null ) {
            return null;
        }

        List<AlmacenVendedorSqlDto> list = new ArrayList<AlmacenVendedorSqlDto>( almacenVendedor.size() );
        for ( AlmacenVendedorDaoDto almacenVendedorDaoDto : almacenVendedor ) {
            list.add( AlmacenVendedorDaoDtoAAlmacenVendedorSqlDto( almacenVendedorDaoDto ) );
        }

        return list;
    }

    @Override
    public List<AlmacenVendedorServicioDto> convertirListaAlmacenVendedorDaoDtoAAlmacenVendedorServicioDto(List<AlmacenVendedorDaoDto> categoria) {
        if ( categoria == null ) {
            return null;
        }

        List<AlmacenVendedorServicioDto> list = new ArrayList<AlmacenVendedorServicioDto>( categoria.size() );
        for ( AlmacenVendedorDaoDto almacenVendedorDaoDto : categoria ) {
            list.add( AlmacenVendedorDaoDtoAAlmacenVendedorServicioDto( almacenVendedorDaoDto ) );
        }

        return list;
    }
}

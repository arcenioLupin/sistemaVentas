package com.pe.ventas.back.utilidades.mapeos.almacenes;

import com.pe.ventas.back.dtos.daos.almacenes.AlmacenDaoDto;
import com.pe.ventas.back.dtos.daos.sql.almacenes.AlmacenSqlDto;
import com.pe.ventas.back.dtos.rest.almacenes.AlmacenRestDto;
import com.pe.ventas.back.dtos.servicios.almacenes.AlmacenServicioDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
public class AlmacenDtoMaperImpl implements AlmacenDtoMaper {

    @Override
    public AlmacenDaoDto almacenSqlDtoAalmacenDaoDTo(AlmacenSqlDto almacen) {
        if ( almacen == null ) {
            return null;
        }

        AlmacenDaoDto almacenDaoDto = new AlmacenDaoDto();

        almacenDaoDto.setCodigo( almacen.getAlmacenCodigo() );
        almacenDaoDto.setAlmacenNombre( almacen.getAlmacenNombre() );
        almacenDaoDto.setTipoAlmacenCodigo( almacen.getTipoAlmacenCodigo() );
        almacenDaoDto.setAlmacenDireccion( almacen.getAlmacenDireccion() );
        almacenDaoDto.setAlmacenDescripcion( almacen.getAlmacenDescripcion() );
        almacenDaoDto.setAlmacenEstado( almacen.getAlmacenEstado() );
        almacenDaoDto.setAlmacenFecre( almacen.getAlmacenFecre() );
        almacenDaoDto.setAlmacenHocre( almacen.getAlmacenHocre() );
        almacenDaoDto.setAlmacenUscre( almacen.getAlmacenUscre() );
        almacenDaoDto.setAlmacenFemod( almacen.getAlmacenFemod() );
        almacenDaoDto.setAlmacenHomod( almacen.getAlmacenHomod() );
        almacenDaoDto.setAlmacenUsmod( almacen.getAlmacenUsmod() );

        return almacenDaoDto;
    }

    @Override
    public AlmacenSqlDto almacenDaoDtoAalmacenSqlDto(AlmacenDaoDto almacen) {
        if ( almacen == null ) {
            return null;
        }

        AlmacenSqlDto almacenSqlDto = new AlmacenSqlDto();

        almacenSqlDto.setAlmacenCodigo( almacen.getCodigo() );
        almacenSqlDto.setAlmacenNombre( almacen.getAlmacenNombre() );
        almacenSqlDto.setTipoAlmacenCodigo( almacen.getTipoAlmacenCodigo() );
        almacenSqlDto.setAlmacenDireccion( almacen.getAlmacenDireccion() );
        almacenSqlDto.setAlmacenDescripcion( almacen.getAlmacenDescripcion() );
        almacenSqlDto.setAlmacenEstado( almacen.getAlmacenEstado() );
        almacenSqlDto.setAlmacenFecre( almacen.getAlmacenFecre() );
        almacenSqlDto.setAlmacenHocre( almacen.getAlmacenHocre() );
        almacenSqlDto.setAlmacenUscre( almacen.getAlmacenUscre() );
        almacenSqlDto.setAlmacenFemod( almacen.getAlmacenFemod() );
        almacenSqlDto.setAlmacenHomod( almacen.getAlmacenHomod() );
        almacenSqlDto.setAlmacenUsmod( almacen.getAlmacenUsmod() );

        return almacenSqlDto;
    }

    @Override
    public AlmacenDaoDto almacenServicioDtoAalmacenDaoDto(AlmacenServicioDto almacen) {
        if ( almacen == null ) {
            return null;
        }

        AlmacenDaoDto almacenDaoDto = new AlmacenDaoDto();

        almacenDaoDto.setCodigo( almacen.getCodigo() );
        almacenDaoDto.setAlmacenNombre( almacen.getAlmacenNombre() );
        almacenDaoDto.setTipoAlmacenCodigo( almacen.getTipoAlmacenCodigo() );
        almacenDaoDto.setAlmacenDireccion( almacen.getAlmacenDireccion() );
        almacenDaoDto.setAlmacenDescripcion( almacen.getAlmacenDescripcion() );
        almacenDaoDto.setAlmacenEstado( almacen.getAlmacenEstado() );
        almacenDaoDto.setAlmacenFecre( almacen.getAlmacenFecre() );
        almacenDaoDto.setAlmacenHocre( almacen.getAlmacenHocre() );
        almacenDaoDto.setAlmacenUscre( almacen.getAlmacenUscre() );
        almacenDaoDto.setAlmacenFemod( almacen.getAlmacenFemod() );
        almacenDaoDto.setAlmacenHomod( almacen.getAlmacenHomod() );
        almacenDaoDto.setAlmacenUsmod( almacen.getAlmacenUsmod() );

        return almacenDaoDto;
    }

    @Override
    public AlmacenServicioDto almacenDaoDtoAalmacenServicioDto(AlmacenDaoDto almacen) {
        if ( almacen == null ) {
            return null;
        }

        AlmacenServicioDto almacenServicioDto = new AlmacenServicioDto();

        almacenServicioDto.setCodigo( almacen.getCodigo() );
        almacenServicioDto.setAlmacenNombre( almacen.getAlmacenNombre() );
        almacenServicioDto.setTipoAlmacenCodigo( almacen.getTipoAlmacenCodigo() );
        almacenServicioDto.setAlmacenDireccion( almacen.getAlmacenDireccion() );
        almacenServicioDto.setAlmacenDescripcion( almacen.getAlmacenDescripcion() );
        almacenServicioDto.setAlmacenEstado( almacen.getAlmacenEstado() );
        almacenServicioDto.setAlmacenFecre( almacen.getAlmacenFecre() );
        almacenServicioDto.setAlmacenHocre( almacen.getAlmacenHocre() );
        almacenServicioDto.setAlmacenUscre( almacen.getAlmacenUscre() );
        almacenServicioDto.setAlmacenFemod( almacen.getAlmacenFemod() );
        almacenServicioDto.setAlmacenHomod( almacen.getAlmacenHomod() );
        almacenServicioDto.setAlmacenUsmod( almacen.getAlmacenUsmod() );

        return almacenServicioDto;
    }

    @Override
    public AlmacenServicioDto almacenRestDtoAalmacenServicioDto(AlmacenRestDto almacen) {
        if ( almacen == null ) {
            return null;
        }

        AlmacenServicioDto almacenServicioDto = new AlmacenServicioDto();

        almacenServicioDto.setCodigo( almacen.getCodigo() );
        almacenServicioDto.setAlmacenNombre( almacen.getAlmacenNombre() );
        almacenServicioDto.setTipoAlmacenCodigo( almacen.getTipoAlmacenCodigo() );
        almacenServicioDto.setAlmacenDireccion( almacen.getAlmacenDireccion() );
        almacenServicioDto.setAlmacenDescripcion( almacen.getAlmacenDescripcion() );
        almacenServicioDto.setAlmacenEstado( almacen.getAlmacenEstado() );
        almacenServicioDto.setAlmacenFecre( almacen.getAlmacenFecre() );
        almacenServicioDto.setAlmacenHocre( almacen.getAlmacenHocre() );
        almacenServicioDto.setAlmacenUscre( almacen.getAlmacenUscre() );
        almacenServicioDto.setAlmacenFemod( almacen.getAlmacenFemod() );
        almacenServicioDto.setAlmacenHomod( almacen.getAlmacenHomod() );
        almacenServicioDto.setAlmacenUsmod( almacen.getAlmacenUsmod() );

        return almacenServicioDto;
    }

    @Override
    public AlmacenRestDto almacenServicioDtoAalmacenRestDto(AlmacenServicioDto almacen) {
        if ( almacen == null ) {
            return null;
        }

        AlmacenRestDto almacenRestDto = new AlmacenRestDto();

        almacenRestDto.setCodigo( almacen.getCodigo() );
        almacenRestDto.setAlmacenNombre( almacen.getAlmacenNombre() );
        almacenRestDto.setTipoAlmacenCodigo( almacen.getTipoAlmacenCodigo() );
        almacenRestDto.setAlmacenDireccion( almacen.getAlmacenDireccion() );
        almacenRestDto.setAlmacenDescripcion( almacen.getAlmacenDescripcion() );
        almacenRestDto.setAlmacenEstado( almacen.getAlmacenEstado() );
        almacenRestDto.setAlmacenFecre( almacen.getAlmacenFecre() );
        almacenRestDto.setAlmacenHocre( almacen.getAlmacenHocre() );
        almacenRestDto.setAlmacenUscre( almacen.getAlmacenUscre() );
        almacenRestDto.setAlmacenFemod( almacen.getAlmacenFemod() );
        almacenRestDto.setAlmacenHomod( almacen.getAlmacenHomod() );
        almacenRestDto.setAlmacenUsmod( almacen.getAlmacenUsmod() );

        return almacenRestDto;
    }

    @Override
    public List<AlmacenRestDto> convertirListaAlmServicioDtoAAlmRestDto(List<AlmacenServicioDto> almacen) {
        if ( almacen == null ) {
            return null;
        }

        List<AlmacenRestDto> list = new ArrayList<AlmacenRestDto>( almacen.size() );
        for ( AlmacenServicioDto almacenServicioDto : almacen ) {
            list.add( almacenServicioDtoAalmacenRestDto( almacenServicioDto ) );
        }

        return list;
    }

    @Override
    public List<AlmacenDaoDto> convertirListaAlmacenSqlDtoAAlmacenDaoDto(List<AlmacenSqlDto> almacen) {
        if ( almacen == null ) {
            return null;
        }

        List<AlmacenDaoDto> list = new ArrayList<AlmacenDaoDto>( almacen.size() );
        for ( AlmacenSqlDto almacenSqlDto : almacen ) {
            list.add( almacenSqlDtoAalmacenDaoDTo( almacenSqlDto ) );
        }

        return list;
    }

    @Override
    public List<AlmacenSqlDto> convertirListaAlmacenDaoDtoAAlmacenSqlDto(List<AlmacenDaoDto> almacen) {
        if ( almacen == null ) {
            return null;
        }

        List<AlmacenSqlDto> list = new ArrayList<AlmacenSqlDto>( almacen.size() );
        for ( AlmacenDaoDto almacenDaoDto : almacen ) {
            list.add( almacenDaoDtoAalmacenSqlDto( almacenDaoDto ) );
        }

        return list;
    }

    @Override
    public List<AlmacenServicioDto> convertirListaAlmacenDaoDtoAAlmacenServicioDto(List<AlmacenDaoDto> almacen) {
        if ( almacen == null ) {
            return null;
        }

        List<AlmacenServicioDto> list = new ArrayList<AlmacenServicioDto>( almacen.size() );
        for ( AlmacenDaoDto almacenDaoDto : almacen ) {
            list.add( almacenDaoDtoAalmacenServicioDto( almacenDaoDto ) );
        }

        return list;
    }
}

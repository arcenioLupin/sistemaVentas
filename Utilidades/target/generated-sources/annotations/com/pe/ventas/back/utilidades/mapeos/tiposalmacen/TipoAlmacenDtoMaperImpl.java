package com.pe.ventas.back.utilidades.mapeos.tiposalmacen;

import com.pe.ventas.back.dtos.daos.sql.tiposalmacen.TipoAlmacenSqlDto;
import com.pe.ventas.back.dtos.daos.tiposalmacen.TipoAlmacenDaoDto;
import com.pe.ventas.back.dtos.rest.tiposalmacen.TipoAlmacenRestDto;
import com.pe.ventas.back.dtos.servicios.tiposalmacen.TipoAlmacenServicioDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
public class TipoAlmacenDtoMaperImpl implements TipoAlmacenDtoMaper {

    @Override
    public TipoAlmacenDaoDto tipoAlmacenSqlDtoAtipoAlmacenDaoDTo(TipoAlmacenSqlDto tipoAlmacen) {
        if ( tipoAlmacen == null ) {
            return null;
        }

        TipoAlmacenDaoDto tipoAlmacenDaoDto = new TipoAlmacenDaoDto();

        tipoAlmacenDaoDto.setCodigo( tipoAlmacen.getTipoAlmacenCodigo() );
        tipoAlmacenDaoDto.setTipoAlmacenNombre( tipoAlmacen.getTipoAlmacenNombre() );
        tipoAlmacenDaoDto.setTipoAlmacenDescripcion( tipoAlmacen.getTipoAlmacenDescripcion() );
        tipoAlmacenDaoDto.setTipoAlmacenEstado( tipoAlmacen.getTipoAlmacenEstado() );
        tipoAlmacenDaoDto.setTipoAlmacenFecre( tipoAlmacen.getTipoAlmacenFecre() );
        tipoAlmacenDaoDto.setTipoAlmacenHocre( tipoAlmacen.getTipoAlmacenHocre() );
        tipoAlmacenDaoDto.setTipoAlmacenUscre( tipoAlmacen.getTipoAlmacenUscre() );
        tipoAlmacenDaoDto.setTipoAlmacenFemod( tipoAlmacen.getTipoAlmacenFemod() );
        tipoAlmacenDaoDto.setTipoAlmacenHomod( tipoAlmacen.getTipoAlmacenHomod() );
        tipoAlmacenDaoDto.setTipoAlmacenUsmod( tipoAlmacen.getTipoAlmacenUsmod() );

        return tipoAlmacenDaoDto;
    }

    @Override
    public TipoAlmacenSqlDto tipoAlmacenDaoDtoAtipoAlmacenSqlDto(TipoAlmacenDaoDto tipoAlmacen) {
        if ( tipoAlmacen == null ) {
            return null;
        }

        TipoAlmacenSqlDto tipoAlmacenSqlDto = new TipoAlmacenSqlDto();

        tipoAlmacenSqlDto.setTipoAlmacenCodigo( tipoAlmacen.getCodigo() );
        tipoAlmacenSqlDto.setTipoAlmacenNombre( tipoAlmacen.getTipoAlmacenNombre() );
        tipoAlmacenSqlDto.setTipoAlmacenDescripcion( tipoAlmacen.getTipoAlmacenDescripcion() );
        tipoAlmacenSqlDto.setTipoAlmacenEstado( tipoAlmacen.getTipoAlmacenEstado() );
        tipoAlmacenSqlDto.setTipoAlmacenFecre( tipoAlmacen.getTipoAlmacenFecre() );
        tipoAlmacenSqlDto.setTipoAlmacenHocre( tipoAlmacen.getTipoAlmacenHocre() );
        tipoAlmacenSqlDto.setTipoAlmacenUscre( tipoAlmacen.getTipoAlmacenUscre() );
        tipoAlmacenSqlDto.setTipoAlmacenFemod( tipoAlmacen.getTipoAlmacenFemod() );
        tipoAlmacenSqlDto.setTipoAlmacenHomod( tipoAlmacen.getTipoAlmacenHomod() );
        tipoAlmacenSqlDto.setTipoAlmacenUsmod( tipoAlmacen.getTipoAlmacenUsmod() );

        return tipoAlmacenSqlDto;
    }

    @Override
    public TipoAlmacenDaoDto tipoAlmacenServicioDtoAtipoAlmacenDaoDto(TipoAlmacenServicioDto tipoAlmacen) {
        if ( tipoAlmacen == null ) {
            return null;
        }

        TipoAlmacenDaoDto tipoAlmacenDaoDto = new TipoAlmacenDaoDto();

        tipoAlmacenDaoDto.setCodigo( tipoAlmacen.getCodigo() );
        tipoAlmacenDaoDto.setTipoAlmacenNombre( tipoAlmacen.getTipoAlmacenNombre() );
        tipoAlmacenDaoDto.setTipoAlmacenDescripcion( tipoAlmacen.getTipoAlmacenDescripcion() );
        tipoAlmacenDaoDto.setTipoAlmacenEstado( tipoAlmacen.getTipoAlmacenEstado() );
        tipoAlmacenDaoDto.setTipoAlmacenFecre( tipoAlmacen.getTipoAlmacenFecre() );
        tipoAlmacenDaoDto.setTipoAlmacenHocre( tipoAlmacen.getTipoAlmacenHocre() );
        tipoAlmacenDaoDto.setTipoAlmacenUscre( tipoAlmacen.getTipoAlmacenUscre() );
        tipoAlmacenDaoDto.setTipoAlmacenFemod( tipoAlmacen.getTipoAlmacenFemod() );
        tipoAlmacenDaoDto.setTipoAlmacenHomod( tipoAlmacen.getTipoAlmacenHomod() );
        tipoAlmacenDaoDto.setTipoAlmacenUsmod( tipoAlmacen.getTipoAlmacenUsmod() );

        return tipoAlmacenDaoDto;
    }

    @Override
    public TipoAlmacenServicioDto tipoAlmacenDaoDtoAtipoAlmacenServicioDto(TipoAlmacenDaoDto tipoAlmacen) {
        if ( tipoAlmacen == null ) {
            return null;
        }

        TipoAlmacenServicioDto tipoAlmacenServicioDto = new TipoAlmacenServicioDto();

        tipoAlmacenServicioDto.setCodigo( tipoAlmacen.getCodigo() );
        tipoAlmacenServicioDto.setTipoAlmacenNombre( tipoAlmacen.getTipoAlmacenNombre() );
        tipoAlmacenServicioDto.setTipoAlmacenDescripcion( tipoAlmacen.getTipoAlmacenDescripcion() );
        tipoAlmacenServicioDto.setTipoAlmacenEstado( tipoAlmacen.getTipoAlmacenEstado() );
        tipoAlmacenServicioDto.setTipoAlmacenFecre( tipoAlmacen.getTipoAlmacenFecre() );
        tipoAlmacenServicioDto.setTipoAlmacenHocre( tipoAlmacen.getTipoAlmacenHocre() );
        tipoAlmacenServicioDto.setTipoAlmacenUscre( tipoAlmacen.getTipoAlmacenUscre() );
        tipoAlmacenServicioDto.setTipoAlmacenFemod( tipoAlmacen.getTipoAlmacenFemod() );
        tipoAlmacenServicioDto.setTipoAlmacenHomod( tipoAlmacen.getTipoAlmacenHomod() );
        tipoAlmacenServicioDto.setTipoAlmacenUsmod( tipoAlmacen.getTipoAlmacenUsmod() );

        return tipoAlmacenServicioDto;
    }

    @Override
    public TipoAlmacenServicioDto tipoAlmacenRestDtoAtipoAlmacenServicioDto(TipoAlmacenRestDto tipoAlmacen) {
        if ( tipoAlmacen == null ) {
            return null;
        }

        TipoAlmacenServicioDto tipoAlmacenServicioDto = new TipoAlmacenServicioDto();

        tipoAlmacenServicioDto.setCodigo( tipoAlmacen.getCodigo() );
        tipoAlmacenServicioDto.setTipoAlmacenNombre( tipoAlmacen.getTipoAlmacenNombre() );
        tipoAlmacenServicioDto.setTipoAlmacenDescripcion( tipoAlmacen.getTipoAlmacenDescripcion() );
        tipoAlmacenServicioDto.setTipoAlmacenEstado( tipoAlmacen.getTipoAlmacenEstado() );

        return tipoAlmacenServicioDto;
    }

    @Override
    public TipoAlmacenRestDto tipoAlmacenServicioDtoAtipoAlmacenRestDto(TipoAlmacenServicioDto tipoAlmacen) {
        if ( tipoAlmacen == null ) {
            return null;
        }

        TipoAlmacenRestDto tipoAlmacenRestDto = new TipoAlmacenRestDto();

        tipoAlmacenRestDto.setCodigo( tipoAlmacen.getCodigo() );
        tipoAlmacenRestDto.setTipoAlmacenNombre( tipoAlmacen.getTipoAlmacenNombre() );
        tipoAlmacenRestDto.setTipoAlmacenDescripcion( tipoAlmacen.getTipoAlmacenDescripcion() );
        tipoAlmacenRestDto.setTipoAlmacenEstado( tipoAlmacen.getTipoAlmacenEstado() );

        return tipoAlmacenRestDto;
    }

    @Override
    public List<TipoAlmacenRestDto> convertirListaTipoAlmacenServicioDtoATipoAlmacenRestDto(List<TipoAlmacenServicioDto> tipoAlmacen) {
        if ( tipoAlmacen == null ) {
            return null;
        }

        List<TipoAlmacenRestDto> list = new ArrayList<TipoAlmacenRestDto>( tipoAlmacen.size() );
        for ( TipoAlmacenServicioDto tipoAlmacenServicioDto : tipoAlmacen ) {
            list.add( tipoAlmacenServicioDtoAtipoAlmacenRestDto( tipoAlmacenServicioDto ) );
        }

        return list;
    }

    @Override
    public List<TipoAlmacenDaoDto> convertirListaTipoAlmacenSqlDtoATipoAlmacenDaoDto(List<TipoAlmacenSqlDto> tipoAlmacen) {
        if ( tipoAlmacen == null ) {
            return null;
        }

        List<TipoAlmacenDaoDto> list = new ArrayList<TipoAlmacenDaoDto>( tipoAlmacen.size() );
        for ( TipoAlmacenSqlDto tipoAlmacenSqlDto : tipoAlmacen ) {
            list.add( tipoAlmacenSqlDtoAtipoAlmacenDaoDTo( tipoAlmacenSqlDto ) );
        }

        return list;
    }

    @Override
    public List<TipoAlmacenSqlDto> convertirListaTipoAlmacenDaoDtoATipoAlmacenSqlDto(List<TipoAlmacenDaoDto> tipoAlmacen) {
        if ( tipoAlmacen == null ) {
            return null;
        }

        List<TipoAlmacenSqlDto> list = new ArrayList<TipoAlmacenSqlDto>( tipoAlmacen.size() );
        for ( TipoAlmacenDaoDto tipoAlmacenDaoDto : tipoAlmacen ) {
            list.add( tipoAlmacenDaoDtoAtipoAlmacenSqlDto( tipoAlmacenDaoDto ) );
        }

        return list;
    }

    @Override
    public List<TipoAlmacenServicioDto> convertirListaTipoAlmacenDaoDtoATipoAlmacenServicioDto(List<TipoAlmacenDaoDto> tipoAlmacen) {
        if ( tipoAlmacen == null ) {
            return null;
        }

        List<TipoAlmacenServicioDto> list = new ArrayList<TipoAlmacenServicioDto>( tipoAlmacen.size() );
        for ( TipoAlmacenDaoDto tipoAlmacenDaoDto : tipoAlmacen ) {
            list.add( tipoAlmacenDaoDtoAtipoAlmacenServicioDto( tipoAlmacenDaoDto ) );
        }

        return list;
    }
}

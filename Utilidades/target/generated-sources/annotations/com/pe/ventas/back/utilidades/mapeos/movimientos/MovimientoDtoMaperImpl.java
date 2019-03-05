package com.pe.ventas.back.utilidades.mapeos.movimientos;

import com.pe.ventas.back.dtos.daos.movimientos.MovimientoDaoDto;
import com.pe.ventas.back.dtos.daos.sql.movimientos.MovimientoSqlDto;
import com.pe.ventas.back.dtos.rest.movimientos.MovimientoRestDto;
import com.pe.ventas.back.dtos.servicios.movimientos.MovimientoServicioDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
public class MovimientoDtoMaperImpl implements MovimientoDtoMaper {

    @Override
    public MovimientoDaoDto movimientoSqlDtoAmovimientoDaoDTo(MovimientoSqlDto movimiento) {
        if ( movimiento == null ) {
            return null;
        }

        MovimientoDaoDto movimientoDaoDto = new MovimientoDaoDto();

        movimientoDaoDto.setCodigo( movimiento.getMovimientoCodigo() );
        movimientoDaoDto.setMovimientoFecha( movimiento.getMovimientoFecha() );
        movimientoDaoDto.setAlmacenCodOrigen( movimiento.getAlmacenCodOrigen() );
        movimientoDaoDto.setAlmacenCodDestino( movimiento.getAlmacenCodDestino() );
        movimientoDaoDto.setMovimientoComentario( movimiento.getMovimientoComentario() );
        movimientoDaoDto.setMovimientoFecre( movimiento.getMovimientoFecre() );
        movimientoDaoDto.setMovimientoHocre( movimiento.getMovimientoHocre() );
        movimientoDaoDto.setMovimientoUscre( movimiento.getMovimientoUscre() );
        movimientoDaoDto.setMovimientoFemod( movimiento.getMovimientoFemod() );
        movimientoDaoDto.setMovimientoHomod( movimiento.getMovimientoHomod() );
        movimientoDaoDto.setMovimientoUsmod( movimiento.getMovimientoUsmod() );

        return movimientoDaoDto;
    }

    @Override
    public MovimientoSqlDto movimientoDaoDtoAmovimientoSqlDto(MovimientoDaoDto movimiento) {
        if ( movimiento == null ) {
            return null;
        }

        MovimientoSqlDto movimientoSqlDto = new MovimientoSqlDto();

        movimientoSqlDto.setMovimientoCodigo( movimiento.getCodigo() );
        movimientoSqlDto.setMovimientoFecha( movimiento.getMovimientoFecha() );
        movimientoSqlDto.setAlmacenCodOrigen( movimiento.getAlmacenCodOrigen() );
        movimientoSqlDto.setAlmacenCodDestino( movimiento.getAlmacenCodDestino() );
        movimientoSqlDto.setMovimientoComentario( movimiento.getMovimientoComentario() );
        movimientoSqlDto.setMovimientoFecre( movimiento.getMovimientoFecre() );
        movimientoSqlDto.setMovimientoHocre( movimiento.getMovimientoHocre() );
        movimientoSqlDto.setMovimientoUscre( movimiento.getMovimientoUscre() );
        movimientoSqlDto.setMovimientoFemod( movimiento.getMovimientoFemod() );
        movimientoSqlDto.setMovimientoHomod( movimiento.getMovimientoHomod() );
        movimientoSqlDto.setMovimientoUsmod( movimiento.getMovimientoUsmod() );

        return movimientoSqlDto;
    }

    @Override
    public MovimientoDaoDto movimientoServicioDtoAmovimientoDaoDto(MovimientoServicioDto movimiento) {
        if ( movimiento == null ) {
            return null;
        }

        MovimientoDaoDto movimientoDaoDto = new MovimientoDaoDto();

        movimientoDaoDto.setCodigo( movimiento.getCodigo() );
        movimientoDaoDto.setMovimientoFecha( movimiento.getMovimientoFecha() );
        movimientoDaoDto.setAlmacenCodOrigen( movimiento.getAlmacenCodOrigen() );
        movimientoDaoDto.setAlmacenCodDestino( movimiento.getAlmacenCodDestino() );
        movimientoDaoDto.setMovimientoComentario( movimiento.getMovimientoComentario() );
        movimientoDaoDto.setMovimientoFecre( movimiento.getMovimientoFecre() );
        movimientoDaoDto.setMovimientoHocre( movimiento.getMovimientoHocre() );
        movimientoDaoDto.setMovimientoUscre( movimiento.getMovimientoUscre() );
        movimientoDaoDto.setMovimientoFemod( movimiento.getMovimientoFemod() );
        movimientoDaoDto.setMovimientoHomod( movimiento.getMovimientoHomod() );
        movimientoDaoDto.setMovimientoUsmod( movimiento.getMovimientoUsmod() );

        return movimientoDaoDto;
    }

    @Override
    public MovimientoServicioDto movimientoDaoDtoAMovimientoServicioDto(MovimientoDaoDto movimiento) {
        if ( movimiento == null ) {
            return null;
        }

        MovimientoServicioDto movimientoServicioDto = new MovimientoServicioDto();

        movimientoServicioDto.setCodigo( movimiento.getCodigo() );
        movimientoServicioDto.setMovimientoFecha( movimiento.getMovimientoFecha() );
        movimientoServicioDto.setAlmacenCodOrigen( movimiento.getAlmacenCodOrigen() );
        movimientoServicioDto.setAlmacenCodDestino( movimiento.getAlmacenCodDestino() );
        movimientoServicioDto.setMovimientoComentario( movimiento.getMovimientoComentario() );
        movimientoServicioDto.setMovimientoFecre( movimiento.getMovimientoFecre() );
        movimientoServicioDto.setMovimientoHocre( movimiento.getMovimientoHocre() );
        movimientoServicioDto.setMovimientoUscre( movimiento.getMovimientoUscre() );
        movimientoServicioDto.setMovimientoFemod( movimiento.getMovimientoFemod() );
        movimientoServicioDto.setMovimientoHomod( movimiento.getMovimientoHomod() );
        movimientoServicioDto.setMovimientoUsmod( movimiento.getMovimientoUsmod() );

        return movimientoServicioDto;
    }

    @Override
    public MovimientoServicioDto movimientoRestDtoAmovimientoServicioDto(MovimientoRestDto movimiento) {
        if ( movimiento == null ) {
            return null;
        }

        MovimientoServicioDto movimientoServicioDto = new MovimientoServicioDto();

        movimientoServicioDto.setCodigo( movimiento.getCodigo() );
        movimientoServicioDto.setMovimientoFecha( movimiento.getMovimientoFecha() );
        movimientoServicioDto.setAlmacenCodOrigen( movimiento.getAlmacenCodOrigen() );
        movimientoServicioDto.setAlmacenCodDestino( movimiento.getAlmacenCodDestino() );
        movimientoServicioDto.setMovimientoComentario( movimiento.getMovimientoComentario() );
        movimientoServicioDto.setMovimientoFecre( movimiento.getMovimientoFecre() );
        movimientoServicioDto.setMovimientoHocre( movimiento.getMovimientoHocre() );
        movimientoServicioDto.setMovimientoUscre( movimiento.getMovimientoUscre() );
        movimientoServicioDto.setMovimientoFemod( movimiento.getMovimientoFemod() );
        movimientoServicioDto.setMovimientoHomod( movimiento.getMovimientoHomod() );
        movimientoServicioDto.setMovimientoUsmod( movimiento.getMovimientoUsmod() );

        return movimientoServicioDto;
    }

    @Override
    public MovimientoRestDto movimientoServicioDtoAmovimientoRestDto(MovimientoServicioDto movimiento) {
        if ( movimiento == null ) {
            return null;
        }

        MovimientoRestDto movimientoRestDto = new MovimientoRestDto();

        movimientoRestDto.setCodigo( movimiento.getCodigo() );
        movimientoRestDto.setMovimientoFecha( movimiento.getMovimientoFecha() );
        movimientoRestDto.setAlmacenCodOrigen( movimiento.getAlmacenCodOrigen() );
        movimientoRestDto.setAlmacenCodDestino( movimiento.getAlmacenCodDestino() );
        movimientoRestDto.setMovimientoComentario( movimiento.getMovimientoComentario() );
        movimientoRestDto.setMovimientoFecre( movimiento.getMovimientoFecre() );
        movimientoRestDto.setMovimientoHocre( movimiento.getMovimientoHocre() );
        movimientoRestDto.setMovimientoUscre( movimiento.getMovimientoUscre() );
        movimientoRestDto.setMovimientoFemod( movimiento.getMovimientoFemod() );
        movimientoRestDto.setMovimientoHomod( movimiento.getMovimientoHomod() );
        movimientoRestDto.setMovimientoUsmod( movimiento.getMovimientoUsmod() );

        return movimientoRestDto;
    }

    @Override
    public List<MovimientoRestDto> convertirListaMovimientoServicioDtoAMovimientoRestDto(List<MovimientoServicioDto> movimiento) {
        if ( movimiento == null ) {
            return null;
        }

        List<MovimientoRestDto> list = new ArrayList<MovimientoRestDto>( movimiento.size() );
        for ( MovimientoServicioDto movimientoServicioDto : movimiento ) {
            list.add( movimientoServicioDtoAmovimientoRestDto( movimientoServicioDto ) );
        }

        return list;
    }

    @Override
    public List<MovimientoDaoDto> convertirListaMovimientoSqlDtoAMovimientoDaoDto(List<MovimientoSqlDto> movimiento) {
        if ( movimiento == null ) {
            return null;
        }

        List<MovimientoDaoDto> list = new ArrayList<MovimientoDaoDto>( movimiento.size() );
        for ( MovimientoSqlDto movimientoSqlDto : movimiento ) {
            list.add( movimientoSqlDtoAmovimientoDaoDTo( movimientoSqlDto ) );
        }

        return list;
    }

    @Override
    public List<MovimientoSqlDto> convertirListaMovimientoDaoDtoAMovimientoSqlDto(List<MovimientoDaoDto> movimiento) {
        if ( movimiento == null ) {
            return null;
        }

        List<MovimientoSqlDto> list = new ArrayList<MovimientoSqlDto>( movimiento.size() );
        for ( MovimientoDaoDto movimientoDaoDto : movimiento ) {
            list.add( movimientoDaoDtoAmovimientoSqlDto( movimientoDaoDto ) );
        }

        return list;
    }

    @Override
    public List<MovimientoServicioDto> convertirListaMovimientoDaoDtoAMovimientoServicioDto(List<MovimientoDaoDto> movimiento) {
        if ( movimiento == null ) {
            return null;
        }

        List<MovimientoServicioDto> list = new ArrayList<MovimientoServicioDto>( movimiento.size() );
        for ( MovimientoDaoDto movimientoDaoDto : movimiento ) {
            list.add( movimientoDaoDtoAMovimientoServicioDto( movimientoDaoDto ) );
        }

        return list;
    }
}

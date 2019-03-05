package com.pe.ventas.back.utilidades.mapeos.movimientoproducto;

import com.pe.ventas.back.dtos.daos.movimientoproducto.MovimientoProductoDaoDto;
import com.pe.ventas.back.dtos.daos.sql.movimientoproducto.MovimientoProductoSqlDto;
import com.pe.ventas.back.dtos.rest.movimientoproducto.MovimientoProductoRestDto;
import com.pe.ventas.back.dtos.servicios.movimientoproducto.MovimientoProductoServicioDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
public class MovimientoProductoDtoMaperImpl implements MovimientoProductoDtoMaper {

    @Override
    public MovimientoProductoDaoDto MovimientoProductoSqlDtoAMovimientoProductoDaoDTo(MovimientoProductoSqlDto movimientoProducto) {
        if ( movimientoProducto == null ) {
            return null;
        }

        MovimientoProductoDaoDto movimientoProductoDaoDto = new MovimientoProductoDaoDto();

        movimientoProductoDaoDto.setCodProducto( movimientoProducto.getProductoCodigo() );
        movimientoProductoDaoDto.setCodMovimiento( movimientoProducto.getMovimientoCodigo() );
        movimientoProductoDaoDto.setMovimientoProductoCant( movimientoProducto.getMovimientoProductoCant() );

        return movimientoProductoDaoDto;
    }

    @Override
    public MovimientoProductoSqlDto MovimientoProductoDaoDtoAMovimientoProductoSqlDto(MovimientoProductoDaoDto movimientoProducto) {
        if ( movimientoProducto == null ) {
            return null;
        }

        MovimientoProductoSqlDto movimientoProductoSqlDto = new MovimientoProductoSqlDto();

        movimientoProductoSqlDto.setProductoCodigo( movimientoProducto.getCodProducto() );
        movimientoProductoSqlDto.setMovimientoCodigo( movimientoProducto.getCodMovimiento() );
        movimientoProductoSqlDto.setMovimientoProductoCant( movimientoProducto.getMovimientoProductoCant() );

        return movimientoProductoSqlDto;
    }

    @Override
    public MovimientoProductoDaoDto MovimientoProductoServicioDtoAMovimientoProductoDaoDto(MovimientoProductoServicioDto movimientoProducto) {
        if ( movimientoProducto == null ) {
            return null;
        }

        MovimientoProductoDaoDto movimientoProductoDaoDto = new MovimientoProductoDaoDto();

        movimientoProductoDaoDto.setCodMovimiento( movimientoProducto.getCodMovimiento() );
        movimientoProductoDaoDto.setCodProducto( movimientoProducto.getCodProducto() );
        movimientoProductoDaoDto.setMovimientoProductoCant( movimientoProducto.getMovimientoProductoCant() );

        return movimientoProductoDaoDto;
    }

    @Override
    public MovimientoProductoServicioDto MovimientoProductoDaoDtoAMovimientoProductoServicioDto(MovimientoProductoDaoDto movimientoProducto) {
        if ( movimientoProducto == null ) {
            return null;
        }

        MovimientoProductoServicioDto movimientoProductoServicioDto = new MovimientoProductoServicioDto();

        movimientoProductoServicioDto.setCodMovimiento( movimientoProducto.getCodMovimiento() );
        movimientoProductoServicioDto.setCodProducto( movimientoProducto.getCodProducto() );
        movimientoProductoServicioDto.setMovimientoProductoCant( movimientoProducto.getMovimientoProductoCant() );

        return movimientoProductoServicioDto;
    }

    @Override
    public MovimientoProductoServicioDto MovimientoProductoRestDtoAMovimientoProductoServicioDto(MovimientoProductoRestDto movimientoProducto) {
        if ( movimientoProducto == null ) {
            return null;
        }

        MovimientoProductoServicioDto movimientoProductoServicioDto = new MovimientoProductoServicioDto();

        movimientoProductoServicioDto.setCodMovimiento( movimientoProducto.getCodMovimiento() );
        movimientoProductoServicioDto.setCodProducto( movimientoProducto.getCodProducto() );
        movimientoProductoServicioDto.setMovimientoProductoCant( movimientoProducto.getMovimientoProductoCant() );

        return movimientoProductoServicioDto;
    }

    @Override
    public MovimientoProductoRestDto MovimientoProductoServicioDtoAMovimientoProductoRestDto(MovimientoProductoServicioDto movimientoProducto) {
        if ( movimientoProducto == null ) {
            return null;
        }

        MovimientoProductoRestDto movimientoProductoRestDto = new MovimientoProductoRestDto();

        movimientoProductoRestDto.setCodMovimiento( movimientoProducto.getCodMovimiento() );
        movimientoProductoRestDto.setCodProducto( movimientoProducto.getCodProducto() );
        movimientoProductoRestDto.setMovimientoProductoCant( movimientoProducto.getMovimientoProductoCant() );

        return movimientoProductoRestDto;
    }

    @Override
    public List<MovimientoProductoRestDto> convertirListaMovimientoProductoServicioDtoMovimientoProductoRestDto(List<MovimientoProductoServicioDto> movimientoProducto) {
        if ( movimientoProducto == null ) {
            return null;
        }

        List<MovimientoProductoRestDto> list = new ArrayList<MovimientoProductoRestDto>( movimientoProducto.size() );
        for ( MovimientoProductoServicioDto movimientoProductoServicioDto : movimientoProducto ) {
            list.add( MovimientoProductoServicioDtoAMovimientoProductoRestDto( movimientoProductoServicioDto ) );
        }

        return list;
    }

    @Override
    public List<MovimientoProductoDaoDto> convertirListaMovimientoProductoSqlDtoAMovimientoProductoDaoDto(List<MovimientoProductoSqlDto> movimientoProducto) {
        if ( movimientoProducto == null ) {
            return null;
        }

        List<MovimientoProductoDaoDto> list = new ArrayList<MovimientoProductoDaoDto>( movimientoProducto.size() );
        for ( MovimientoProductoSqlDto movimientoProductoSqlDto : movimientoProducto ) {
            list.add( MovimientoProductoSqlDtoAMovimientoProductoDaoDTo( movimientoProductoSqlDto ) );
        }

        return list;
    }

    @Override
    public List<MovimientoProductoSqlDto> convertirListaMovimientoProductoDaoDtoAMovimientoProductoSqlDto(List<MovimientoProductoDaoDto> movimientoProducto) {
        if ( movimientoProducto == null ) {
            return null;
        }

        List<MovimientoProductoSqlDto> list = new ArrayList<MovimientoProductoSqlDto>( movimientoProducto.size() );
        for ( MovimientoProductoDaoDto movimientoProductoDaoDto : movimientoProducto ) {
            list.add( MovimientoProductoDaoDtoAMovimientoProductoSqlDto( movimientoProductoDaoDto ) );
        }

        return list;
    }

    @Override
    public List<MovimientoProductoServicioDto> convertirListaMovimientoProductoDaoDtoAMovimientoProductoServicioDto(List<MovimientoProductoDaoDto> movimientoProducto) {
        if ( movimientoProducto == null ) {
            return null;
        }

        List<MovimientoProductoServicioDto> list = new ArrayList<MovimientoProductoServicioDto>( movimientoProducto.size() );
        for ( MovimientoProductoDaoDto movimientoProductoDaoDto : movimientoProducto ) {
            list.add( MovimientoProductoDaoDtoAMovimientoProductoServicioDto( movimientoProductoDaoDto ) );
        }

        return list;
    }
}

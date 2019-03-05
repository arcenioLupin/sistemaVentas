package com.pe.ventas.back.utilidades.mapeos.almacenproducto;

import com.pe.ventas.back.dtos.daos.almacenproducto.AlmacenProductoDaoDto;
import com.pe.ventas.back.dtos.daos.sql.almacenproducto.AlmacenProductoSqlDto;
import com.pe.ventas.back.dtos.rest.almacenproducto.AlmacenProductoRestDto;
import com.pe.ventas.back.dtos.servicios.almacenproducto.AlmacenProductoServicioDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
public class AlmacenProductoDtoMaperImpl implements AlmacenProductoDtoMaper {

    @Override
    public AlmacenProductoDaoDto almacenProductoSqlDtoAalmacenProductoDaoDTo(AlmacenProductoSqlDto almacenProducto) {
        if ( almacenProducto == null ) {
            return null;
        }

        AlmacenProductoDaoDto almacenProductoDaoDto = new AlmacenProductoDaoDto();

        almacenProductoDaoDto.setCodProducto( almacenProducto.getProductoCodigo() );
        almacenProductoDaoDto.setCodAlmacen( almacenProducto.getAlmacenCodigo() );
        almacenProductoDaoDto.setAlmacenProductoStock( almacenProducto.getAlmacenProductoStock() );
        almacenProductoDaoDto.setUnidadMedidaCodigo( almacenProducto.getUnidadMedidaCodigo() );
        almacenProductoDaoDto.setAlmacenProductoPrecio( almacenProducto.getAlmacenProductoPrecio() );
        almacenProductoDaoDto.setMonedaCodigo( almacenProducto.getMonedaCodigo() );
        almacenProductoDaoDto.setAlmacenProductoEstado( almacenProducto.getAlmacenProductoEstado() );

        return almacenProductoDaoDto;
    }

    @Override
    public AlmacenProductoSqlDto almacenProductoDaoDtoAalmacenProductoSqlDto(AlmacenProductoDaoDto almacenProducto) {
        if ( almacenProducto == null ) {
            return null;
        }

        AlmacenProductoSqlDto almacenProductoSqlDto = new AlmacenProductoSqlDto();

        almacenProductoSqlDto.setAlmacenCodigo( almacenProducto.getCodAlmacen() );
        almacenProductoSqlDto.setProductoCodigo( almacenProducto.getCodProducto() );
        almacenProductoSqlDto.setAlmacenProductoStock( almacenProducto.getAlmacenProductoStock() );
        almacenProductoSqlDto.setUnidadMedidaCodigo( almacenProducto.getUnidadMedidaCodigo() );
        almacenProductoSqlDto.setAlmacenProductoPrecio( almacenProducto.getAlmacenProductoPrecio() );
        almacenProductoSqlDto.setMonedaCodigo( almacenProducto.getMonedaCodigo() );
        almacenProductoSqlDto.setAlmacenProductoEstado( almacenProducto.getAlmacenProductoEstado() );

        return almacenProductoSqlDto;
    }

    @Override
    public AlmacenProductoDaoDto almacenProductoServicioDtoAalmacenProductoDaoDto(AlmacenProductoServicioDto almacenProducto) {
        if ( almacenProducto == null ) {
            return null;
        }

        AlmacenProductoDaoDto almacenProductoDaoDto = new AlmacenProductoDaoDto();

        almacenProductoDaoDto.setCodAlmacen( almacenProducto.getCodAlmacen() );
        almacenProductoDaoDto.setCodProducto( almacenProducto.getCodProducto() );
        almacenProductoDaoDto.setAlmacenProductoStock( almacenProducto.getAlmacenProductoStock() );
        almacenProductoDaoDto.setUnidadMedidaCodigo( almacenProducto.getUnidadMedidaCodigo() );
        almacenProductoDaoDto.setAlmacenProductoPrecio( almacenProducto.getAlmacenProductoPrecio() );
        almacenProductoDaoDto.setMonedaCodigo( almacenProducto.getMonedaCodigo() );
        almacenProductoDaoDto.setAlmacenProductoEstado( almacenProducto.getAlmacenProductoEstado() );

        return almacenProductoDaoDto;
    }

    @Override
    public AlmacenProductoServicioDto almacenProductoDaoDtoAalmacenProductoServicioDto(AlmacenProductoDaoDto almacenProducto) {
        if ( almacenProducto == null ) {
            return null;
        }

        AlmacenProductoServicioDto almacenProductoServicioDto = new AlmacenProductoServicioDto();

        almacenProductoServicioDto.setCodAlmacen( almacenProducto.getCodAlmacen() );
        almacenProductoServicioDto.setCodProducto( almacenProducto.getCodProducto() );
        almacenProductoServicioDto.setAlmacenProductoStock( almacenProducto.getAlmacenProductoStock() );
        almacenProductoServicioDto.setUnidadMedidaCodigo( almacenProducto.getUnidadMedidaCodigo() );
        almacenProductoServicioDto.setAlmacenProductoPrecio( almacenProducto.getAlmacenProductoPrecio() );
        almacenProductoServicioDto.setMonedaCodigo( almacenProducto.getMonedaCodigo() );
        almacenProductoServicioDto.setAlmacenProductoEstado( almacenProducto.getAlmacenProductoEstado() );

        return almacenProductoServicioDto;
    }

    @Override
    public AlmacenProductoServicioDto almacenProductoRestDtoAalmacenProductoServicioDto(AlmacenProductoRestDto almacenProducto) {
        if ( almacenProducto == null ) {
            return null;
        }

        AlmacenProductoServicioDto almacenProductoServicioDto = new AlmacenProductoServicioDto();

        almacenProductoServicioDto.setCodAlmacen( almacenProducto.getCodAlmacen() );
        almacenProductoServicioDto.setCodProducto( almacenProducto.getCodProducto() );
        almacenProductoServicioDto.setAlmacenProductoStock( almacenProducto.getAlmacenProductoStock() );
        almacenProductoServicioDto.setUnidadMedidaCodigo( almacenProducto.getUnidadMedidaCodigo() );
        almacenProductoServicioDto.setAlmacenProductoPrecio( almacenProducto.getAlmacenProductoPrecio() );
        almacenProductoServicioDto.setMonedaCodigo( almacenProducto.getMonedaCodigo() );
        almacenProductoServicioDto.setAlmacenProductoEstado( almacenProducto.getAlmacenProductoEstado() );

        return almacenProductoServicioDto;
    }

    @Override
    public AlmacenProductoRestDto almacenProductoServicioDtoAalmacenProductoRestDto(AlmacenProductoServicioDto almacenProducto) {
        if ( almacenProducto == null ) {
            return null;
        }

        AlmacenProductoRestDto almacenProductoRestDto = new AlmacenProductoRestDto();

        almacenProductoRestDto.setCodAlmacen( almacenProducto.getCodAlmacen() );
        almacenProductoRestDto.setCodProducto( almacenProducto.getCodProducto() );
        almacenProductoRestDto.setAlmacenProductoStock( almacenProducto.getAlmacenProductoStock() );
        almacenProductoRestDto.setUnidadMedidaCodigo( almacenProducto.getUnidadMedidaCodigo() );
        almacenProductoRestDto.setAlmacenProductoPrecio( almacenProducto.getAlmacenProductoPrecio() );
        almacenProductoRestDto.setMonedaCodigo( almacenProducto.getMonedaCodigo() );
        almacenProductoRestDto.setAlmacenProductoEstado( almacenProducto.getAlmacenProductoEstado() );

        return almacenProductoRestDto;
    }

    @Override
    public List<AlmacenProductoRestDto> convertirListaAlmacenProductoServicioDtoAlmacenProductoRestDto(List<AlmacenProductoServicioDto> almacenProducto) {
        if ( almacenProducto == null ) {
            return null;
        }

        List<AlmacenProductoRestDto> list = new ArrayList<AlmacenProductoRestDto>( almacenProducto.size() );
        for ( AlmacenProductoServicioDto almacenProductoServicioDto : almacenProducto ) {
            list.add( almacenProductoServicioDtoAalmacenProductoRestDto( almacenProductoServicioDto ) );
        }

        return list;
    }

    @Override
    public List<AlmacenProductoDaoDto> convertirListaAlmacenProductoSqlDtoAAlmacenProductoDaoDto(List<AlmacenProductoSqlDto> almacenProducto) {
        if ( almacenProducto == null ) {
            return null;
        }

        List<AlmacenProductoDaoDto> list = new ArrayList<AlmacenProductoDaoDto>( almacenProducto.size() );
        for ( AlmacenProductoSqlDto almacenProductoSqlDto : almacenProducto ) {
            list.add( almacenProductoSqlDtoAalmacenProductoDaoDTo( almacenProductoSqlDto ) );
        }

        return list;
    }

    @Override
    public List<AlmacenProductoSqlDto> convertirListaAlmacenProductoDaoDtoAAlmacenProductoSqlDto(List<AlmacenProductoDaoDto> almacenProducto) {
        if ( almacenProducto == null ) {
            return null;
        }

        List<AlmacenProductoSqlDto> list = new ArrayList<AlmacenProductoSqlDto>( almacenProducto.size() );
        for ( AlmacenProductoDaoDto almacenProductoDaoDto : almacenProducto ) {
            list.add( almacenProductoDaoDtoAalmacenProductoSqlDto( almacenProductoDaoDto ) );
        }

        return list;
    }

    @Override
    public List<AlmacenProductoServicioDto> convertirListaAlmacenProductoDaoDtoAAlmacenProductoServicioDto(List<AlmacenProductoDaoDto> almacenProducto) {
        if ( almacenProducto == null ) {
            return null;
        }

        List<AlmacenProductoServicioDto> list = new ArrayList<AlmacenProductoServicioDto>( almacenProducto.size() );
        for ( AlmacenProductoDaoDto almacenProductoDaoDto : almacenProducto ) {
            list.add( almacenProductoDaoDtoAalmacenProductoServicioDto( almacenProductoDaoDto ) );
        }

        return list;
    }
}

package com.pe.ventas.back.utilidades.mapeos.productos;

import com.pe.ventas.back.dtos.daos.productos.ProductoDaoDto;
import com.pe.ventas.back.dtos.daos.sql.productos.ProductoSqlDto;
import com.pe.ventas.back.dtos.rest.productos.ProductoRestDto;
import com.pe.ventas.back.dtos.servicios.productos.ProductoServicioDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
public class ProductoDtoMaperImpl implements ProductoDtoMaper {

    @Override
    public ProductoDaoDto productoSqlDtoAproductoDaoDTo(ProductoSqlDto producto) {
        if ( producto == null ) {
            return null;
        }

        ProductoDaoDto productoDaoDto = new ProductoDaoDto();

        productoDaoDto.setCodigo( producto.getProductoCodigo() );
        productoDaoDto.setProductoNombre( producto.getProductoNombre() );
        productoDaoDto.setProductoDescripcion( producto.getProductoDescripcion() );
        productoDaoDto.setCategoriaCodigo( producto.getCategoriaCodigo() );
        productoDaoDto.setUnidadMedidaCodigo( producto.getUnidadMedidaCodigo() );
        productoDaoDto.setProductoPrecio( producto.getProductoPrecio() );
        productoDaoDto.setMonedaCodigo( producto.getMonedaCodigo() );
        productoDaoDto.setProductoEstado( producto.getProductoEstado() );
        productoDaoDto.setProductoFecre( producto.getProductoFecre() );
        productoDaoDto.setProductoHocre( producto.getProductoHocre() );
        productoDaoDto.setProductoUscre( producto.getProductoUscre() );
        productoDaoDto.setProductoFemod( producto.getProductoFemod() );
        productoDaoDto.setProductoHomod( producto.getProductoHomod() );
        productoDaoDto.setProductoUsmod( producto.getProductoUsmod() );

        return productoDaoDto;
    }

    @Override
    public ProductoSqlDto productoDaoDtoAproductoSqlDto(ProductoDaoDto producto) {
        if ( producto == null ) {
            return null;
        }

        ProductoSqlDto productoSqlDto = new ProductoSqlDto();

        productoSqlDto.setProductoCodigo( producto.getCodigo() );
        productoSqlDto.setProductoNombre( producto.getProductoNombre() );
        productoSqlDto.setProductoDescripcion( producto.getProductoDescripcion() );
        productoSqlDto.setCategoriaCodigo( producto.getCategoriaCodigo() );
        productoSqlDto.setUnidadMedidaCodigo( producto.getUnidadMedidaCodigo() );
        productoSqlDto.setProductoPrecio( producto.getProductoPrecio() );
        productoSqlDto.setMonedaCodigo( producto.getMonedaCodigo() );
        productoSqlDto.setProductoEstado( producto.getProductoEstado() );
        productoSqlDto.setProductoFecre( producto.getProductoFecre() );
        productoSqlDto.setProductoHocre( producto.getProductoHocre() );
        productoSqlDto.setProductoUscre( producto.getProductoUscre() );
        productoSqlDto.setProductoFemod( producto.getProductoFemod() );
        productoSqlDto.setProductoHomod( producto.getProductoHomod() );
        productoSqlDto.setProductoUsmod( producto.getProductoUsmod() );

        return productoSqlDto;
    }

    @Override
    public ProductoDaoDto productoServicioDtoAproductoDaoDto(ProductoServicioDto producto) {
        if ( producto == null ) {
            return null;
        }

        ProductoDaoDto productoDaoDto = new ProductoDaoDto();

        productoDaoDto.setCodigo( producto.getCodigo() );
        productoDaoDto.setProductoNombre( producto.getProductoNombre() );
        productoDaoDto.setProductoDescripcion( producto.getProductoDescripcion() );
        productoDaoDto.setCategoriaCodigo( producto.getCategoriaCodigo() );
        productoDaoDto.setUnidadMedidaCodigo( producto.getUnidadMedidaCodigo() );
        productoDaoDto.setProductoPrecio( producto.getProductoPrecio() );
        productoDaoDto.setMonedaCodigo( producto.getMonedaCodigo() );
        productoDaoDto.setProductoEstado( producto.getProductoEstado() );
        productoDaoDto.setProductoFecre( producto.getProductoFecre() );
        productoDaoDto.setProductoHocre( producto.getProductoHocre() );
        productoDaoDto.setProductoUscre( producto.getProductoUscre() );
        productoDaoDto.setProductoFemod( producto.getProductoFemod() );
        productoDaoDto.setProductoHomod( producto.getProductoHomod() );
        productoDaoDto.setProductoUsmod( producto.getProductoUsmod() );

        return productoDaoDto;
    }

    @Override
    public ProductoServicioDto productoDaoDtoAproductoServicioDto(ProductoDaoDto producto) {
        if ( producto == null ) {
            return null;
        }

        ProductoServicioDto productoServicioDto = new ProductoServicioDto();

        productoServicioDto.setCodigo( producto.getCodigo() );
        productoServicioDto.setProductoNombre( producto.getProductoNombre() );
        productoServicioDto.setProductoDescripcion( producto.getProductoDescripcion() );
        productoServicioDto.setCategoriaCodigo( producto.getCategoriaCodigo() );
        productoServicioDto.setUnidadMedidaCodigo( producto.getUnidadMedidaCodigo() );
        productoServicioDto.setProductoPrecio( producto.getProductoPrecio() );
        productoServicioDto.setMonedaCodigo( producto.getMonedaCodigo() );
        productoServicioDto.setProductoEstado( producto.getProductoEstado() );
        productoServicioDto.setProductoFecre( producto.getProductoFecre() );
        productoServicioDto.setProductoHocre( producto.getProductoHocre() );
        productoServicioDto.setProductoUscre( producto.getProductoUscre() );
        productoServicioDto.setProductoFemod( producto.getProductoFemod() );
        productoServicioDto.setProductoHomod( producto.getProductoHomod() );
        productoServicioDto.setProductoUsmod( producto.getProductoUsmod() );

        return productoServicioDto;
    }

    @Override
    public ProductoServicioDto productoRestDtoAproductoServicioDto(ProductoRestDto producto) {
        if ( producto == null ) {
            return null;
        }

        ProductoServicioDto productoServicioDto = new ProductoServicioDto();

        productoServicioDto.setCodigo( producto.getCodigo() );
        productoServicioDto.setProductoNombre( producto.getProductoNombre() );
        productoServicioDto.setProductoDescripcion( producto.getProductoDescripcion() );
        productoServicioDto.setCategoriaCodigo( producto.getCategoriaCodigo() );
        productoServicioDto.setUnidadMedidaCodigo( producto.getUnidadMedidaCodigo() );
        productoServicioDto.setProductoPrecio( producto.getProductoPrecio() );
        productoServicioDto.setMonedaCodigo( producto.getMonedaCodigo() );
        productoServicioDto.setProductoEstado( producto.getProductoEstado() );

        return productoServicioDto;
    }

    @Override
    public ProductoRestDto productoServicioDtoAproductoRestDto(ProductoServicioDto producto) {
        if ( producto == null ) {
            return null;
        }

        ProductoRestDto productoRestDto = new ProductoRestDto();

        productoRestDto.setCodigo( producto.getCodigo() );
        productoRestDto.setProductoNombre( producto.getProductoNombre() );
        productoRestDto.setProductoDescripcion( producto.getProductoDescripcion() );
        productoRestDto.setCategoriaCodigo( producto.getCategoriaCodigo() );
        productoRestDto.setUnidadMedidaCodigo( producto.getUnidadMedidaCodigo() );
        productoRestDto.setProductoPrecio( producto.getProductoPrecio() );
        productoRestDto.setMonedaCodigo( producto.getMonedaCodigo() );
        productoRestDto.setProductoEstado( producto.getProductoEstado() );

        return productoRestDto;
    }

    @Override
    public List<ProductoRestDto> convertirListaProductoServicioDtoAProductoRestDto(List<ProductoServicioDto> producto) {
        if ( producto == null ) {
            return null;
        }

        List<ProductoRestDto> list = new ArrayList<ProductoRestDto>( producto.size() );
        for ( ProductoServicioDto productoServicioDto : producto ) {
            list.add( productoServicioDtoAproductoRestDto( productoServicioDto ) );
        }

        return list;
    }

    @Override
    public List<ProductoDaoDto> convertirListaProductoSqlDtoAProductoDaoDto(List<ProductoSqlDto> producto) {
        if ( producto == null ) {
            return null;
        }

        List<ProductoDaoDto> list = new ArrayList<ProductoDaoDto>( producto.size() );
        for ( ProductoSqlDto productoSqlDto : producto ) {
            list.add( productoSqlDtoAproductoDaoDTo( productoSqlDto ) );
        }

        return list;
    }

    @Override
    public List<ProductoSqlDto> convertirListaProductoDaoDtoAProductoSqlDto(List<ProductoDaoDto> producto) {
        if ( producto == null ) {
            return null;
        }

        List<ProductoSqlDto> list = new ArrayList<ProductoSqlDto>( producto.size() );
        for ( ProductoDaoDto productoDaoDto : producto ) {
            list.add( productoDaoDtoAproductoSqlDto( productoDaoDto ) );
        }

        return list;
    }

    @Override
    public List<ProductoServicioDto> convertirListaProductoDaoDtoAProductoServicioDto(List<ProductoDaoDto> producto) {
        if ( producto == null ) {
            return null;
        }

        List<ProductoServicioDto> list = new ArrayList<ProductoServicioDto>( producto.size() );
        for ( ProductoDaoDto productoDaoDto : producto ) {
            list.add( productoDaoDtoAproductoServicioDto( productoDaoDto ) );
        }

        return list;
    }
}

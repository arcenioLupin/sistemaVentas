package com.pe.ventas.back.utilidades.mapeos.ventas;

import com.pe.ventas.back.dtos.daos.sql.ventas.VentaSqlDto;
import com.pe.ventas.back.dtos.daos.ventas.VentaDaoDto;
import com.pe.ventas.back.dtos.rest.ventas.VentaRestDto;
import com.pe.ventas.back.dtos.servicios.ventas.VentaServicioDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
public class VentaDtoMaperImpl implements VentaDtoMaper {

    @Override
    public VentaDaoDto VentaSqlDtoAVentaDaoDTo(VentaSqlDto venta) {
        if ( venta == null ) {
            return null;
        }

        VentaDaoDto ventaDaoDto = new VentaDaoDto();

        ventaDaoDto.setCodVenta( venta.getVentaCodigo() );
        ventaDaoDto.setVentaFecha( venta.getVentaFecha() );
        ventaDaoDto.setAlmacenCodigo( venta.getAlmacenCodigo() );
        ventaDaoDto.setVendedorCodigo( venta.getVendedorCodigo() );
        ventaDaoDto.setMonedaCodigo( venta.getMonedaCodigo() );
        ventaDaoDto.setVentaSubTotal( venta.getVentaSubTotal() );
        ventaDaoDto.setVentaDescuento( venta.getVentaDescuento() );
        ventaDaoDto.setVentaTotal( venta.getVentaTotal() );
        ventaDaoDto.setVentaEfectivo( venta.getVentaEfectivo() );
        ventaDaoDto.setVentaTarjeta( venta.getVentaTarjeta() );
        ventaDaoDto.setVentaReferTarjeta( venta.getVentaReferTarjeta() );
        ventaDaoDto.setVentaComentario( venta.getVentaComentario() );
        ventaDaoDto.setVentaEstado( venta.getVentaEstado() );
        ventaDaoDto.setVentaFecre( venta.getVentaFecre() );
        ventaDaoDto.setVentaHocre( venta.getVentaHocre() );
        ventaDaoDto.setVentaUscre( venta.getVentaUscre() );
        ventaDaoDto.setVentaFemod( venta.getVentaFemod() );
        ventaDaoDto.setVentaHomod( venta.getVentaHomod() );
        ventaDaoDto.setVentaUsmod( venta.getVentaUsmod() );

        return ventaDaoDto;
    }

    @Override
    public VentaSqlDto VentaDaoDtoAVentaSqlDto(VentaDaoDto venta) {
        if ( venta == null ) {
            return null;
        }

        VentaSqlDto ventaSqlDto = new VentaSqlDto();

        ventaSqlDto.setVentaCodigo( venta.getCodVenta() );
        ventaSqlDto.setVentaFecha( venta.getVentaFecha() );
        ventaSqlDto.setAlmacenCodigo( venta.getAlmacenCodigo() );
        ventaSqlDto.setVendedorCodigo( venta.getVendedorCodigo() );
        ventaSqlDto.setMonedaCodigo( venta.getMonedaCodigo() );
        ventaSqlDto.setVentaSubTotal( venta.getVentaSubTotal() );
        ventaSqlDto.setVentaDescuento( venta.getVentaDescuento() );
        ventaSqlDto.setVentaTotal( venta.getVentaTotal() );
        ventaSqlDto.setVentaEfectivo( venta.getVentaEfectivo() );
        ventaSqlDto.setVentaTarjeta( venta.getVentaTarjeta() );
        ventaSqlDto.setVentaReferTarjeta( venta.getVentaReferTarjeta() );
        ventaSqlDto.setVentaComentario( venta.getVentaComentario() );
        ventaSqlDto.setVentaEstado( venta.getVentaEstado() );
        ventaSqlDto.setVentaFecre( venta.getVentaFecre() );
        ventaSqlDto.setVentaHocre( venta.getVentaHocre() );
        ventaSqlDto.setVentaUscre( venta.getVentaUscre() );
        ventaSqlDto.setVentaFemod( venta.getVentaFemod() );
        ventaSqlDto.setVentaHomod( venta.getVentaHomod() );
        ventaSqlDto.setVentaUsmod( venta.getVentaUsmod() );

        return ventaSqlDto;
    }

    @Override
    public VentaDaoDto VentaServicioDtoAVentaDaoDto(VentaServicioDto venta) {
        if ( venta == null ) {
            return null;
        }

        VentaDaoDto ventaDaoDto = new VentaDaoDto();

        ventaDaoDto.setCodVenta( venta.getCodVenta() );
        ventaDaoDto.setVentaFecha( venta.getVentaFecha() );
        ventaDaoDto.setAlmacenCodigo( venta.getAlmacenCodigo() );
        ventaDaoDto.setVendedorCodigo( venta.getVendedorCodigo() );
        ventaDaoDto.setMonedaCodigo( venta.getMonedaCodigo() );
        ventaDaoDto.setVentaSubTotal( venta.getVentaSubTotal() );
        ventaDaoDto.setVentaDescuento( venta.getVentaDescuento() );
        ventaDaoDto.setVentaTotal( venta.getVentaTotal() );
        ventaDaoDto.setVentaEfectivo( venta.getVentaEfectivo() );
        ventaDaoDto.setVentaTarjeta( venta.getVentaTarjeta() );
        ventaDaoDto.setVentaReferTarjeta( venta.getVentaReferTarjeta() );
        ventaDaoDto.setVentaComentario( venta.getVentaComentario() );
        ventaDaoDto.setVentaEstado( venta.getVentaEstado() );
        ventaDaoDto.setVentaFecre( venta.getVentaFecre() );
        ventaDaoDto.setVentaHocre( venta.getVentaHocre() );
        ventaDaoDto.setVentaUscre( venta.getVentaUscre() );
        ventaDaoDto.setVentaFemod( venta.getVentaFemod() );
        ventaDaoDto.setVentaHomod( venta.getVentaHomod() );
        ventaDaoDto.setVentaUsmod( venta.getVentaUsmod() );

        return ventaDaoDto;
    }

    @Override
    public VentaServicioDto VentaDaoDtoAVentaServicioDto(VentaDaoDto venta) {
        if ( venta == null ) {
            return null;
        }

        VentaServicioDto ventaServicioDto = new VentaServicioDto();

        ventaServicioDto.setCodVenta( venta.getCodVenta() );
        ventaServicioDto.setVentaFecha( venta.getVentaFecha() );
        ventaServicioDto.setAlmacenCodigo( venta.getAlmacenCodigo() );
        ventaServicioDto.setVendedorCodigo( venta.getVendedorCodigo() );
        ventaServicioDto.setMonedaCodigo( venta.getMonedaCodigo() );
        ventaServicioDto.setVentaSubTotal( venta.getVentaSubTotal() );
        ventaServicioDto.setVentaDescuento( venta.getVentaDescuento() );
        ventaServicioDto.setVentaTotal( venta.getVentaTotal() );
        ventaServicioDto.setVentaEfectivo( venta.getVentaEfectivo() );
        ventaServicioDto.setVentaTarjeta( venta.getVentaTarjeta() );
        ventaServicioDto.setVentaReferTarjeta( venta.getVentaReferTarjeta() );
        ventaServicioDto.setVentaComentario( venta.getVentaComentario() );
        ventaServicioDto.setVentaEstado( venta.getVentaEstado() );
        ventaServicioDto.setVentaFecre( venta.getVentaFecre() );
        ventaServicioDto.setVentaHocre( venta.getVentaHocre() );
        ventaServicioDto.setVentaUscre( venta.getVentaUscre() );
        ventaServicioDto.setVentaFemod( venta.getVentaFemod() );
        ventaServicioDto.setVentaHomod( venta.getVentaHomod() );
        ventaServicioDto.setVentaUsmod( venta.getVentaUsmod() );

        return ventaServicioDto;
    }

    @Override
    public VentaServicioDto VentaRestDtoAVentaServicioDto(VentaRestDto venta) {
        if ( venta == null ) {
            return null;
        }

        VentaServicioDto ventaServicioDto = new VentaServicioDto();

        ventaServicioDto.setCodVenta( venta.getCodVenta() );
        ventaServicioDto.setVentaFecha( venta.getVentaFecha() );
        ventaServicioDto.setAlmacenCodigo( venta.getAlmacenCodigo() );
        ventaServicioDto.setVendedorCodigo( venta.getVendedorCodigo() );
        ventaServicioDto.setMonedaCodigo( venta.getMonedaCodigo() );
        ventaServicioDto.setVentaSubTotal( venta.getVentaSubTotal() );
        ventaServicioDto.setVentaDescuento( venta.getVentaDescuento() );
        ventaServicioDto.setVentaTotal( venta.getVentaTotal() );
        ventaServicioDto.setVentaEfectivo( venta.getVentaEfectivo() );
        ventaServicioDto.setVentaTarjeta( venta.getVentaTarjeta() );
        ventaServicioDto.setVentaReferTarjeta( venta.getVentaReferTarjeta() );
        ventaServicioDto.setVentaComentario( venta.getVentaComentario() );
        ventaServicioDto.setVentaEstado( venta.getVentaEstado() );
        ventaServicioDto.setVentaFecre( venta.getVentaFecre() );
        ventaServicioDto.setVentaHocre( venta.getVentaHocre() );
        ventaServicioDto.setVentaUscre( venta.getVentaUscre() );
        ventaServicioDto.setVentaFemod( venta.getVentaFemod() );
        ventaServicioDto.setVentaHomod( venta.getVentaHomod() );
        ventaServicioDto.setVentaUsmod( venta.getVentaUsmod() );

        return ventaServicioDto;
    }

    @Override
    public VentaRestDto VentaServicioDtoAVentaRestDto(VentaServicioDto venta) {
        if ( venta == null ) {
            return null;
        }

        VentaRestDto ventaRestDto = new VentaRestDto();

        ventaRestDto.setCodVenta( venta.getCodVenta() );
        ventaRestDto.setVentaFecha( venta.getVentaFecha() );
        ventaRestDto.setAlmacenCodigo( venta.getAlmacenCodigo() );
        ventaRestDto.setVendedorCodigo( venta.getVendedorCodigo() );
        ventaRestDto.setMonedaCodigo( venta.getMonedaCodigo() );
        ventaRestDto.setVentaSubTotal( venta.getVentaSubTotal() );
        ventaRestDto.setVentaDescuento( venta.getVentaDescuento() );
        ventaRestDto.setVentaTotal( venta.getVentaTotal() );
        ventaRestDto.setVentaEfectivo( venta.getVentaEfectivo() );
        ventaRestDto.setVentaTarjeta( venta.getVentaTarjeta() );
        ventaRestDto.setVentaReferTarjeta( venta.getVentaReferTarjeta() );
        ventaRestDto.setVentaComentario( venta.getVentaComentario() );
        ventaRestDto.setVentaEstado( venta.getVentaEstado() );
        ventaRestDto.setVentaFecre( venta.getVentaFecre() );
        ventaRestDto.setVentaHocre( venta.getVentaHocre() );
        ventaRestDto.setVentaUscre( venta.getVentaUscre() );
        ventaRestDto.setVentaFemod( venta.getVentaFemod() );
        ventaRestDto.setVentaHomod( venta.getVentaHomod() );
        ventaRestDto.setVentaUsmod( venta.getVentaUsmod() );

        return ventaRestDto;
    }

    @Override
    public List<VentaRestDto> convertirListaVentaServicioDtoAVentaRestDto(List<VentaServicioDto> venta) {
        if ( venta == null ) {
            return null;
        }

        List<VentaRestDto> list = new ArrayList<VentaRestDto>( venta.size() );
        for ( VentaServicioDto ventaServicioDto : venta ) {
            list.add( VentaServicioDtoAVentaRestDto( ventaServicioDto ) );
        }

        return list;
    }

    @Override
    public List<VentaDaoDto> convertirListaVentaSqlDtoAVentaDaoDto(List<VentaSqlDto> venta) {
        if ( venta == null ) {
            return null;
        }

        List<VentaDaoDto> list = new ArrayList<VentaDaoDto>( venta.size() );
        for ( VentaSqlDto ventaSqlDto : venta ) {
            list.add( VentaSqlDtoAVentaDaoDTo( ventaSqlDto ) );
        }

        return list;
    }

    @Override
    public List<VentaSqlDto> convertirListaVentaDaoDtoAVentaSqlDto(List<VentaDaoDto> venta) {
        if ( venta == null ) {
            return null;
        }

        List<VentaSqlDto> list = new ArrayList<VentaSqlDto>( venta.size() );
        for ( VentaDaoDto ventaDaoDto : venta ) {
            list.add( VentaDaoDtoAVentaSqlDto( ventaDaoDto ) );
        }

        return list;
    }

    @Override
    public List<VentaServicioDto> convertirListaVentaDaoDtoAVentaServicioDto(List<VentaDaoDto> venta) {
        if ( venta == null ) {
            return null;
        }

        List<VentaServicioDto> list = new ArrayList<VentaServicioDto>( venta.size() );
        for ( VentaDaoDto ventaDaoDto : venta ) {
            list.add( VentaDaoDtoAVentaServicioDto( ventaDaoDto ) );
        }

        return list;
    }
}

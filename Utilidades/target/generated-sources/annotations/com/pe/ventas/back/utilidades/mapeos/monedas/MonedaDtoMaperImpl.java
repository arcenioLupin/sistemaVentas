package com.pe.ventas.back.utilidades.mapeos.monedas;

import com.pe.ventas.back.dtos.daos.monedas.MonedaDaoDto;
import com.pe.ventas.back.dtos.daos.sql.monedas.MonedaSqlDto;
import com.pe.ventas.back.dtos.rest.monedas.MonedaRestDto;
import com.pe.ventas.back.dtos.servicios.monedas.MonedaServicioDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
public class MonedaDtoMaperImpl implements MonedaDtoMaper {

    @Override
    public MonedaDaoDto monedaSqlDtoAmonedaDaoDTo(MonedaSqlDto moneda) {
        if ( moneda == null ) {
            return null;
        }

        MonedaDaoDto monedaDaoDto = new MonedaDaoDto();

        monedaDaoDto.setCodigo( moneda.getMonedaCodigo() );
        monedaDaoDto.setMonedaSimbolo( moneda.getMonedaSimbolo() );
        monedaDaoDto.setMonedaNombre( moneda.getMonedaNombre() );

        return monedaDaoDto;
    }

    @Override
    public MonedaSqlDto monedaDaoDtoAmonedaSqlDto(MonedaDaoDto moneda) {
        if ( moneda == null ) {
            return null;
        }

        MonedaSqlDto monedaSqlDto = new MonedaSqlDto();

        monedaSqlDto.setMonedaCodigo( moneda.getCodigo() );
        monedaSqlDto.setMonedaSimbolo( moneda.getMonedaSimbolo() );
        monedaSqlDto.setMonedaNombre( moneda.getMonedaNombre() );

        return monedaSqlDto;
    }

    @Override
    public MonedaDaoDto monedaServicioDtoAmonedaDaoDto(MonedaServicioDto moneda) {
        if ( moneda == null ) {
            return null;
        }

        MonedaDaoDto monedaDaoDto = new MonedaDaoDto();

        monedaDaoDto.setCodigo( moneda.getCodigo() );
        monedaDaoDto.setMonedaSimbolo( moneda.getMonedaSimbolo() );
        monedaDaoDto.setMonedaNombre( moneda.getMonedaNombre() );

        return monedaDaoDto;
    }

    @Override
    public MonedaServicioDto monedaDaoDtoAmonedaServicioDto(MonedaDaoDto moneda) {
        if ( moneda == null ) {
            return null;
        }

        MonedaServicioDto monedaServicioDto = new MonedaServicioDto();

        monedaServicioDto.setCodigo( moneda.getCodigo() );
        monedaServicioDto.setMonedaSimbolo( moneda.getMonedaSimbolo() );
        monedaServicioDto.setMonedaNombre( moneda.getMonedaNombre() );

        return monedaServicioDto;
    }

    @Override
    public MonedaServicioDto monedaRestDtoAmonedaServicioDto(MonedaRestDto moneda) {
        if ( moneda == null ) {
            return null;
        }

        MonedaServicioDto monedaServicioDto = new MonedaServicioDto();

        monedaServicioDto.setCodigo( moneda.getCodigo() );
        monedaServicioDto.setMonedaSimbolo( moneda.getMonedaSimbolo() );
        monedaServicioDto.setMonedaNombre( moneda.getMonedaNombre() );

        return monedaServicioDto;
    }

    @Override
    public MonedaRestDto monedaServicioDtoAmonedaRestDto(MonedaServicioDto moneda) {
        if ( moneda == null ) {
            return null;
        }

        MonedaRestDto monedaRestDto = new MonedaRestDto();

        monedaRestDto.setCodigo( moneda.getCodigo() );
        monedaRestDto.setMonedaSimbolo( moneda.getMonedaSimbolo() );
        monedaRestDto.setMonedaNombre( moneda.getMonedaNombre() );

        return monedaRestDto;
    }

    @Override
    public List<MonedaRestDto> convertirListaMonedaServicioDtoAMonedaRestDto(List<MonedaServicioDto> moneda) {
        if ( moneda == null ) {
            return null;
        }

        List<MonedaRestDto> list = new ArrayList<MonedaRestDto>( moneda.size() );
        for ( MonedaServicioDto monedaServicioDto : moneda ) {
            list.add( monedaServicioDtoAmonedaRestDto( monedaServicioDto ) );
        }

        return list;
    }

    @Override
    public List<MonedaDaoDto> convertirListaMonedaSqlDtoAMonedaDaoDto(List<MonedaSqlDto> moneda) {
        if ( moneda == null ) {
            return null;
        }

        List<MonedaDaoDto> list = new ArrayList<MonedaDaoDto>( moneda.size() );
        for ( MonedaSqlDto monedaSqlDto : moneda ) {
            list.add( monedaSqlDtoAmonedaDaoDTo( monedaSqlDto ) );
        }

        return list;
    }

    @Override
    public List<MonedaSqlDto> convertirListaMonedaDaoDtoAMonedaSqlDto(List<MonedaDaoDto> moneda) {
        if ( moneda == null ) {
            return null;
        }

        List<MonedaSqlDto> list = new ArrayList<MonedaSqlDto>( moneda.size() );
        for ( MonedaDaoDto monedaDaoDto : moneda ) {
            list.add( monedaDaoDtoAmonedaSqlDto( monedaDaoDto ) );
        }

        return list;
    }

    @Override
    public List<MonedaServicioDto> convertirListaMonedaDaoDtoAMonedaServicioDto(List<MonedaDaoDto> moneda) {
        if ( moneda == null ) {
            return null;
        }

        List<MonedaServicioDto> list = new ArrayList<MonedaServicioDto>( moneda.size() );
        for ( MonedaDaoDto monedaDaoDto : moneda ) {
            list.add( monedaDaoDtoAmonedaServicioDto( monedaDaoDto ) );
        }

        return list;
    }
}

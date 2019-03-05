package com.pe.ventas.back.utilidades.mapeos.unidadmedida;

import com.pe.ventas.back.dtos.daos.sql.unidadmedida.UnidadMedidaSqlDto;
import com.pe.ventas.back.dtos.daos.unidadmedida.UnidadMedidaDaoDto;
import com.pe.ventas.back.dtos.rest.unidadmedida.UnidadMedidaRestDto;
import com.pe.ventas.back.dtos.servicios.unidadmedida.UnidadMedidaServicioDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
public class UnidadMedidaDtoMaperImpl implements UnidadMedidaDtoMaper {

    @Override
    public UnidadMedidaDaoDto unidadMedidaSqlDtoAunidadMedidaDaoDTo(UnidadMedidaSqlDto unidadMedida) {
        if ( unidadMedida == null ) {
            return null;
        }

        UnidadMedidaDaoDto unidadMedidaDaoDto = new UnidadMedidaDaoDto();

        unidadMedidaDaoDto.setCodigo( unidadMedida.getUnidadMedidaCodigo() );
        unidadMedidaDaoDto.setUnidadMedidaSimbolo( unidadMedida.getUnidadMedidaSimbolo() );
        unidadMedidaDaoDto.setUnidadMedidaNombre( unidadMedida.getUnidadMedidaNombre() );

        return unidadMedidaDaoDto;
    }

    @Override
    public UnidadMedidaSqlDto unidadMedidaDaoDtoAunidadMedidaSqlDto(UnidadMedidaDaoDto unidadMedida) {
        if ( unidadMedida == null ) {
            return null;
        }

        UnidadMedidaSqlDto unidadMedidaSqlDto = new UnidadMedidaSqlDto();

        unidadMedidaSqlDto.setUnidadMedidaCodigo( unidadMedida.getCodigo() );
        unidadMedidaSqlDto.setUnidadMedidaSimbolo( unidadMedida.getUnidadMedidaSimbolo() );
        unidadMedidaSqlDto.setUnidadMedidaNombre( unidadMedida.getUnidadMedidaNombre() );

        return unidadMedidaSqlDto;
    }

    @Override
    public UnidadMedidaDaoDto unidadMedidaServicioDtoAunidadMedidaDaoDto(UnidadMedidaServicioDto unidadMedida) {
        if ( unidadMedida == null ) {
            return null;
        }

        UnidadMedidaDaoDto unidadMedidaDaoDto = new UnidadMedidaDaoDto();

        unidadMedidaDaoDto.setCodigo( unidadMedida.getCodigo() );
        unidadMedidaDaoDto.setUnidadMedidaSimbolo( unidadMedida.getUnidadMedidaSimbolo() );
        unidadMedidaDaoDto.setUnidadMedidaNombre( unidadMedida.getUnidadMedidaNombre() );

        return unidadMedidaDaoDto;
    }

    @Override
    public UnidadMedidaServicioDto unidadMedidaDaoDtoAunidadMedidaServicioDto(UnidadMedidaDaoDto unidadMedida) {
        if ( unidadMedida == null ) {
            return null;
        }

        UnidadMedidaServicioDto unidadMedidaServicioDto = new UnidadMedidaServicioDto();

        unidadMedidaServicioDto.setCodigo( unidadMedida.getCodigo() );
        unidadMedidaServicioDto.setUnidadMedidaSimbolo( unidadMedida.getUnidadMedidaSimbolo() );
        unidadMedidaServicioDto.setUnidadMedidaNombre( unidadMedida.getUnidadMedidaNombre() );

        return unidadMedidaServicioDto;
    }

    @Override
    public UnidadMedidaServicioDto unidadMedidaRestDtoAunidadMedidaServicioDto(UnidadMedidaRestDto unidadMedida) {
        if ( unidadMedida == null ) {
            return null;
        }

        UnidadMedidaServicioDto unidadMedidaServicioDto = new UnidadMedidaServicioDto();

        unidadMedidaServicioDto.setCodigo( unidadMedida.getCodigo() );
        unidadMedidaServicioDto.setUnidadMedidaSimbolo( unidadMedida.getUnidadMedidaSimbolo() );
        unidadMedidaServicioDto.setUnidadMedidaNombre( unidadMedida.getUnidadMedidaNombre() );

        return unidadMedidaServicioDto;
    }

    @Override
    public UnidadMedidaRestDto unidadMedidaServicioDtoAunidadMedidaRestDto(UnidadMedidaServicioDto unidadMedida) {
        if ( unidadMedida == null ) {
            return null;
        }

        UnidadMedidaRestDto unidadMedidaRestDto = new UnidadMedidaRestDto();

        unidadMedidaRestDto.setCodigo( unidadMedida.getCodigo() );
        unidadMedidaRestDto.setUnidadMedidaSimbolo( unidadMedida.getUnidadMedidaSimbolo() );
        unidadMedidaRestDto.setUnidadMedidaNombre( unidadMedida.getUnidadMedidaNombre() );

        return unidadMedidaRestDto;
    }

    @Override
    public List<UnidadMedidaRestDto> convertirListaunidadMedidaServicioDtoAunidadMedidaRestDto(List<UnidadMedidaServicioDto> unidadMedida) {
        if ( unidadMedida == null ) {
            return null;
        }

        List<UnidadMedidaRestDto> list = new ArrayList<UnidadMedidaRestDto>( unidadMedida.size() );
        for ( UnidadMedidaServicioDto unidadMedidaServicioDto : unidadMedida ) {
            list.add( unidadMedidaServicioDtoAunidadMedidaRestDto( unidadMedidaServicioDto ) );
        }

        return list;
    }

    @Override
    public List<UnidadMedidaDaoDto> convertirListaunidadMedidaSqlDtoAunidadMedidaDaoDto(List<UnidadMedidaSqlDto> unidadMedida) {
        if ( unidadMedida == null ) {
            return null;
        }

        List<UnidadMedidaDaoDto> list = new ArrayList<UnidadMedidaDaoDto>( unidadMedida.size() );
        for ( UnidadMedidaSqlDto unidadMedidaSqlDto : unidadMedida ) {
            list.add( unidadMedidaSqlDtoAunidadMedidaDaoDTo( unidadMedidaSqlDto ) );
        }

        return list;
    }

    @Override
    public List<UnidadMedidaSqlDto> convertirListaunidadMedidaDaoDtoAunidadMedidaSqlDto(List<UnidadMedidaDaoDto> unidadMedida) {
        if ( unidadMedida == null ) {
            return null;
        }

        List<UnidadMedidaSqlDto> list = new ArrayList<UnidadMedidaSqlDto>( unidadMedida.size() );
        for ( UnidadMedidaDaoDto unidadMedidaDaoDto : unidadMedida ) {
            list.add( unidadMedidaDaoDtoAunidadMedidaSqlDto( unidadMedidaDaoDto ) );
        }

        return list;
    }

    @Override
    public List<UnidadMedidaServicioDto> convertirListaunidadMedidaDaoDtoAunidadMedidaServicioDto(List<UnidadMedidaDaoDto> unidadMedida) {
        if ( unidadMedida == null ) {
            return null;
        }

        List<UnidadMedidaServicioDto> list = new ArrayList<UnidadMedidaServicioDto>( unidadMedida.size() );
        for ( UnidadMedidaDaoDto unidadMedidaDaoDto : unidadMedida ) {
            list.add( unidadMedidaDaoDtoAunidadMedidaServicioDto( unidadMedidaDaoDto ) );
        }

        return list;
    }
}

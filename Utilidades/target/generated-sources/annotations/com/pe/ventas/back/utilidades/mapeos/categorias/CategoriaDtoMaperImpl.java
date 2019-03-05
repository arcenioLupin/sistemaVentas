package com.pe.ventas.back.utilidades.mapeos.categorias;

import com.pe.ventas.back.dtos.daos.categorias.CategoriaDaoDto;
import com.pe.ventas.back.dtos.daos.sql.categorias.CategoriaSqlDto;
import com.pe.ventas.back.dtos.rest.categorias.CategoriaRestDto;
import com.pe.ventas.back.dtos.servicios.categorias.CategoriaServicioDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
public class CategoriaDtoMaperImpl implements CategoriaDtoMaper {

    @Override
    public CategoriaDaoDto categoriaSqlDtoAcategoriaDaoDTo(CategoriaSqlDto categoria) {
        if ( categoria == null ) {
            return null;
        }

        CategoriaDaoDto categoriaDaoDto = new CategoriaDaoDto();

        categoriaDaoDto.setCodigo( categoria.getCategoriaCodigo() );
        categoriaDaoDto.setCategoriaNombre( categoria.getCategoriaNombre() );
        categoriaDaoDto.setCategoriaDescripcion( categoria.getCategoriaDescripcion() );
        categoriaDaoDto.setCategoriaEstado( categoria.getCategoriaEstado() );
        categoriaDaoDto.setCategoriaFecre( categoria.getCategoriaFecre() );
        categoriaDaoDto.setCategoriaHocre( categoria.getCategoriaHocre() );
        categoriaDaoDto.setCategoriaUscre( categoria.getCategoriaUscre() );
        categoriaDaoDto.setCategoriaFemod( categoria.getCategoriaFemod() );
        categoriaDaoDto.setCategoriaHomod( categoria.getCategoriaHomod() );
        categoriaDaoDto.setCategoriaUsmod( categoria.getCategoriaUsmod() );

        return categoriaDaoDto;
    }

    @Override
    public CategoriaSqlDto categoriaDaoDtoAcategoriaSqlDto(CategoriaDaoDto categoria) {
        if ( categoria == null ) {
            return null;
        }

        CategoriaSqlDto categoriaSqlDto = new CategoriaSqlDto();

        categoriaSqlDto.setCategoriaCodigo( categoria.getCodigo() );
        categoriaSqlDto.setCategoriaNombre( categoria.getCategoriaNombre() );
        categoriaSqlDto.setCategoriaDescripcion( categoria.getCategoriaDescripcion() );
        categoriaSqlDto.setCategoriaEstado( categoria.getCategoriaEstado() );
        categoriaSqlDto.setCategoriaFecre( categoria.getCategoriaFecre() );
        categoriaSqlDto.setCategoriaHocre( categoria.getCategoriaHocre() );
        categoriaSqlDto.setCategoriaUscre( categoria.getCategoriaUscre() );
        categoriaSqlDto.setCategoriaFemod( categoria.getCategoriaFemod() );
        categoriaSqlDto.setCategoriaHomod( categoria.getCategoriaHomod() );
        categoriaSqlDto.setCategoriaUsmod( categoria.getCategoriaUsmod() );

        return categoriaSqlDto;
    }

    @Override
    public CategoriaDaoDto categoriaServicioDtoAcategoriaDaoDto(CategoriaServicioDto categoria) {
        if ( categoria == null ) {
            return null;
        }

        CategoriaDaoDto categoriaDaoDto = new CategoriaDaoDto();

        categoriaDaoDto.setCodigo( categoria.getCodigo() );
        categoriaDaoDto.setCategoriaNombre( categoria.getCategoriaNombre() );
        categoriaDaoDto.setCategoriaDescripcion( categoria.getCategoriaDescripcion() );
        categoriaDaoDto.setCategoriaEstado( categoria.getCategoriaEstado() );
        categoriaDaoDto.setCategoriaFecre( categoria.getCategoriaFecre() );
        categoriaDaoDto.setCategoriaHocre( categoria.getCategoriaHocre() );
        categoriaDaoDto.setCategoriaUscre( categoria.getCategoriaUscre() );
        categoriaDaoDto.setCategoriaFemod( categoria.getCategoriaFemod() );
        categoriaDaoDto.setCategoriaHomod( categoria.getCategoriaHomod() );
        categoriaDaoDto.setCategoriaUsmod( categoria.getCategoriaUsmod() );

        return categoriaDaoDto;
    }

    @Override
    public CategoriaServicioDto categoriaDaoDtoACategoriaServicioDto(CategoriaDaoDto categoria) {
        if ( categoria == null ) {
            return null;
        }

        CategoriaServicioDto categoriaServicioDto = new CategoriaServicioDto();

        categoriaServicioDto.setCodigo( categoria.getCodigo() );
        categoriaServicioDto.setCategoriaNombre( categoria.getCategoriaNombre() );
        categoriaServicioDto.setCategoriaDescripcion( categoria.getCategoriaDescripcion() );
        categoriaServicioDto.setCategoriaEstado( categoria.getCategoriaEstado() );
        categoriaServicioDto.setCategoriaFecre( categoria.getCategoriaFecre() );
        categoriaServicioDto.setCategoriaHocre( categoria.getCategoriaHocre() );
        categoriaServicioDto.setCategoriaUscre( categoria.getCategoriaUscre() );
        categoriaServicioDto.setCategoriaFemod( categoria.getCategoriaFemod() );
        categoriaServicioDto.setCategoriaHomod( categoria.getCategoriaHomod() );
        categoriaServicioDto.setCategoriaUsmod( categoria.getCategoriaUsmod() );

        return categoriaServicioDto;
    }

    @Override
    public CategoriaServicioDto categoriaRestDtoAcategoriaServicioDto(CategoriaRestDto categoria) {
        if ( categoria == null ) {
            return null;
        }

        CategoriaServicioDto categoriaServicioDto = new CategoriaServicioDto();

        categoriaServicioDto.setCodigo( categoria.getCategoriaCodigo() );
        categoriaServicioDto.setCategoriaNombre( categoria.getCategoriaNombre() );
        categoriaServicioDto.setCategoriaDescripcion( categoria.getCategoriaDescripcion() );
        categoriaServicioDto.setCategoriaEstado( categoria.getCategoriaEstado() );

        return categoriaServicioDto;
    }

    @Override
    public CategoriaRestDto categoriaServicioDtoAcategoriaRestDto(CategoriaServicioDto categoria) {
        if ( categoria == null ) {
            return null;
        }

        CategoriaRestDto categoriaRestDto = new CategoriaRestDto();

        categoriaRestDto.setCategoriaCodigo( categoria.getCodigo() );
        categoriaRestDto.setCategoriaNombre( categoria.getCategoriaNombre() );
        categoriaRestDto.setCategoriaDescripcion( categoria.getCategoriaDescripcion() );
        categoriaRestDto.setCategoriaEstado( categoria.getCategoriaEstado() );

        return categoriaRestDto;
    }

    @Override
    public List<CategoriaRestDto> convertirListaCategoriaServicioDtoACategoriaRestDto(List<CategoriaServicioDto> categoria) {
        if ( categoria == null ) {
            return null;
        }

        List<CategoriaRestDto> list = new ArrayList<CategoriaRestDto>( categoria.size() );
        for ( CategoriaServicioDto categoriaServicioDto : categoria ) {
            list.add( categoriaServicioDtoAcategoriaRestDto( categoriaServicioDto ) );
        }

        return list;
    }

    @Override
    public List<CategoriaDaoDto> convertirListaCategoriaSqlDtoACategoriaDaoDto(List<CategoriaSqlDto> categoria) {
        if ( categoria == null ) {
            return null;
        }

        List<CategoriaDaoDto> list = new ArrayList<CategoriaDaoDto>( categoria.size() );
        for ( CategoriaSqlDto categoriaSqlDto : categoria ) {
            list.add( categoriaSqlDtoAcategoriaDaoDTo( categoriaSqlDto ) );
        }

        return list;
    }

    @Override
    public List<CategoriaSqlDto> convertirListaCategoriaDaoDtoACategoriaSqlDto(List<CategoriaDaoDto> categoria) {
        if ( categoria == null ) {
            return null;
        }

        List<CategoriaSqlDto> list = new ArrayList<CategoriaSqlDto>( categoria.size() );
        for ( CategoriaDaoDto categoriaDaoDto : categoria ) {
            list.add( categoriaDaoDtoAcategoriaSqlDto( categoriaDaoDto ) );
        }

        return list;
    }

    @Override
    public List<CategoriaServicioDto> convertirListaCategoriaDaoDtoACategoriaServicioDto(List<CategoriaDaoDto> categoria) {
        if ( categoria == null ) {
            return null;
        }

        List<CategoriaServicioDto> list = new ArrayList<CategoriaServicioDto>( categoria.size() );
        for ( CategoriaDaoDto categoriaDaoDto : categoria ) {
            list.add( categoriaDaoDtoACategoriaServicioDto( categoriaDaoDto ) );
        }

        return list;
    }
}

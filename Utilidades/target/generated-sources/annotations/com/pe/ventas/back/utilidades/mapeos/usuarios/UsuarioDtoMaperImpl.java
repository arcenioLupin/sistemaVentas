package com.pe.ventas.back.utilidades.mapeos.usuarios;

import com.pe.ventas.back.dtos.daos.sql.usuarios.UsuarioSqlDto;
import com.pe.ventas.back.dtos.daos.usuarios.UsuarioDaoDto;
import com.pe.ventas.back.dtos.rest.usuarios.UsuarioRestDto;
import com.pe.ventas.back.dtos.servicios.usuarios.UsuarioServicioDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
public class UsuarioDtoMaperImpl implements UsuarioDtoMaper {

    @Override
    public UsuarioDaoDto usuarioSqlDtoAUsuarioDaoDto(UsuarioSqlDto usuario) {
        if ( usuario == null ) {
            return null;
        }

        UsuarioDaoDto usuarioDaoDto = new UsuarioDaoDto();

        usuarioDaoDto.setIdentificador( usuario.getId() );
        usuarioDaoDto.setAlias( usuario.getAlias() );
        usuarioDaoDto.setCorreo( usuario.getCorreo() );
        usuarioDaoDto.setContrasenya( usuario.getContrasenya() );
        usuarioDaoDto.setRegistro( usuario.getRegistro() );
        usuarioDaoDto.setAcceso( usuario.getAcceso() );
        usuarioDaoDto.setModificacion( usuario.getModificacion() );

        return usuarioDaoDto;
    }

    @Override
    public UsuarioSqlDto usuarioDaoDtoAUsuarioSqlDto(UsuarioDaoDto usuario) {
        if ( usuario == null ) {
            return null;
        }

        UsuarioSqlDto usuarioSqlDto = new UsuarioSqlDto();

        usuarioSqlDto.setId( usuario.getIdentificador() );
        usuarioSqlDto.setAlias( usuario.getAlias() );
        usuarioSqlDto.setCorreo( usuario.getCorreo() );
        usuarioSqlDto.setContrasenya( usuario.getContrasenya() );
        usuarioSqlDto.setRegistro( usuario.getRegistro() );
        usuarioSqlDto.setAcceso( usuario.getAcceso() );
        usuarioSqlDto.setModificacion( usuario.getModificacion() );

        return usuarioSqlDto;
    }

    @Override
    public UsuarioDaoDto usuarioServicioDtoAUsuarioDaoDto(UsuarioServicioDto usuario) {
        if ( usuario == null ) {
            return null;
        }

        UsuarioDaoDto usuarioDaoDto = new UsuarioDaoDto();

        usuarioDaoDto.setIdentificador( usuario.getIdentificador() );
        usuarioDaoDto.setAlias( usuario.getAlias() );
        usuarioDaoDto.setCorreo( usuario.getCorreo() );
        usuarioDaoDto.setContrasenya( usuario.getContrasenya() );
        usuarioDaoDto.setRegistro( usuario.getRegistro() );
        usuarioDaoDto.setAcceso( usuario.getAcceso() );
        usuarioDaoDto.setModificacion( usuario.getModificacion() );

        return usuarioDaoDto;
    }

    @Override
    public UsuarioServicioDto usuarioDaoDtoAUsuarioServicioDto(UsuarioDaoDto usuario) {
        if ( usuario == null ) {
            return null;
        }

        UsuarioServicioDto usuarioServicioDto = new UsuarioServicioDto();

        usuarioServicioDto.setIdentificador( usuario.getIdentificador() );
        usuarioServicioDto.setAlias( usuario.getAlias() );
        usuarioServicioDto.setCorreo( usuario.getCorreo() );
        usuarioServicioDto.setContrasenya( usuario.getContrasenya() );
        usuarioServicioDto.setRegistro( usuario.getRegistro() );
        usuarioServicioDto.setAcceso( usuario.getAcceso() );
        usuarioServicioDto.setModificacion( usuario.getModificacion() );

        return usuarioServicioDto;
    }

    @Override
    public UsuarioServicioDto usuarioRestDtoAUsuarioServicioDto(UsuarioRestDto usuario) {
        if ( usuario == null ) {
            return null;
        }

        UsuarioServicioDto usuarioServicioDto = new UsuarioServicioDto();

        usuarioServicioDto.setIdentificador( usuario.getId() );
        usuarioServicioDto.setAlias( usuario.getAlias() );
        usuarioServicioDto.setCorreo( usuario.getCorreo() );
        usuarioServicioDto.setContrasenya( usuario.getContrasenya() );

        return usuarioServicioDto;
    }

    @Override
    public UsuarioRestDto usuarioServicioDtoAUsuarioRestDto(UsuarioServicioDto usuario) {
        if ( usuario == null ) {
            return null;
        }

        UsuarioRestDto usuarioRestDto = new UsuarioRestDto();

        usuarioRestDto.setId( usuario.getIdentificador() );
        usuarioRestDto.setAlias( usuario.getAlias() );
        usuarioRestDto.setCorreo( usuario.getCorreo() );

        return usuarioRestDto;
    }

    @Override
    public List<UsuarioRestDto> convertirListaUsuarioServicioDtoAUsuarioRestDto(List<UsuarioServicioDto> usuario) {
        if ( usuario == null ) {
            return null;
        }

        List<UsuarioRestDto> list = new ArrayList<UsuarioRestDto>( usuario.size() );
        for ( UsuarioServicioDto usuarioServicioDto : usuario ) {
            list.add( usuarioServicioDtoAUsuarioRestDto( usuarioServicioDto ) );
        }

        return list;
    }

    @Override
    public List<UsuarioDaoDto> convertirListaUsuarioSqlDtoAUsuarioDaoDto(List<UsuarioSqlDto> usuario) {
        if ( usuario == null ) {
            return null;
        }

        List<UsuarioDaoDto> list = new ArrayList<UsuarioDaoDto>( usuario.size() );
        for ( UsuarioSqlDto usuarioSqlDto : usuario ) {
            list.add( usuarioSqlDtoAUsuarioDaoDto( usuarioSqlDto ) );
        }

        return list;
    }

    @Override
    public List<UsuarioSqlDto> convertirListaUsuarioDaoDtoAUsuarioSqlDto(List<UsuarioDaoDto> usuario) {
        if ( usuario == null ) {
            return null;
        }

        List<UsuarioSqlDto> list = new ArrayList<UsuarioSqlDto>( usuario.size() );
        for ( UsuarioDaoDto usuarioDaoDto : usuario ) {
            list.add( usuarioDaoDtoAUsuarioSqlDto( usuarioDaoDto ) );
        }

        return list;
    }

    @Override
    public List<UsuarioServicioDto> convertirListaUsuarioDaoDtoAUsuarioServicioDto(List<UsuarioDaoDto> usuario) {
        if ( usuario == null ) {
            return null;
        }

        List<UsuarioServicioDto> list = new ArrayList<UsuarioServicioDto>( usuario.size() );
        for ( UsuarioDaoDto usuarioDaoDto : usuario ) {
            list.add( usuarioDaoDtoAUsuarioServicioDto( usuarioDaoDto ) );
        }

        return list;
    }
}

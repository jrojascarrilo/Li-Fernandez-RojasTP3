require 'sinatra'
require './usuarios.rb'

get '/' do
	"Bienvenido a la aplicacion de Vuelvase loco entreprise!"
end

#Caso para ingresar un usuario nuevo
get '/ingresar/:nombre/:pass' do
	actual = Usuario.new(params[:nombre],params[:pass]) #Se crea un objeto con los datos del usuario
	imprimir = actual.ingresarUsuario #Es el valor de respuesta a la aplicacion
	"" + imprimir + ""
end


#Caso para loguearse 
get '/loguear/:nombre/:pass' do 
	actual = Usuario.new(params[:nombre],params[:pass]) #Se crea un objeto con los datos del usuario
	imprimir = actual.loguear #Es el valor de respuesta a la aplicacion
	"" + imprimir + ""
end


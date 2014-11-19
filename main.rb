require 'sinatra'
require './usuarios.rb'

get '/' do
	"Hello, world!"
end


get '/ingresar/:nombre/:pass' do
	actual = Usuario.new(params[:nombre],params[:pass])
	imprimir = actual.ingresarUsuario
	" " + imprimir + ""
end


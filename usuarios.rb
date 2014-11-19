$listaUsuarios=[]

class Usuario
	def initialize(nombre , pass)#metodo para inizializar la clase
		#atributos
		@nombre = nombre
		@pass = pass
	end

	def getNombre
		return @nombre
	end

	def getpass
		return @pass
	end

	def ingresarUsuario
		if verificaUsuario
			objeto= Usuario.new(@nombre,@pass)
			$listaUsuarios<<objeto
			return "anadido"
		
		else 
			return "noanadido"
		end
	end


	def verificaUsuario
		contador=0
		while (($listaUsuarios).length!=contador)
			if @nombre == ($listaUsuarios[contador]).getNombre
				return false
			end
		contador+=1
		end
		return true
	
	end

	def imprimirListaUsuarios
		contador=0
		while (($listaUsuarios).length!=contador)
			return "El usuario es "+$listaUsuarios[contador].getNombre+" con la contrasena "+$listaUsuarios[contador].getpass
			contador+=1

		end
	end


end

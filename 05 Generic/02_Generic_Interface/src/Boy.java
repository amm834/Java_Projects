public class Boy<I,N> implements Student<I,N>
	{

		public I id;
		public N name;

		public Boy(I id, N name)
			{
				this.id = id;
				this.name = name;
			}
		@Override
		public I getId()
			{
				return this.id;
			}

		@Override
		public N getName()
			{
				return this.name;
			}

	}

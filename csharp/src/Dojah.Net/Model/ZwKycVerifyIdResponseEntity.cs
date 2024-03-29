/*
 * DOJAH Publilc APIs
 *
 * Use Dojah to verify, onboard and manage user identity across Africa!
 *
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://konfigthis.com
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Dojah.Net.Client.OpenAPIDateConverter;

namespace Dojah.Net.Model
{
    /// <summary>
    /// ZwKycVerifyIdResponseEntity
    /// </summary>
    [DataContract(Name = "ZwKycVerifyIdResponse_entity")]
    public partial class ZwKycVerifyIdResponseEntity : IEquatable<ZwKycVerifyIdResponseEntity>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ZwKycVerifyIdResponseEntity" /> class.
        /// </summary>
        /// <param name="personNo">personNo.</param>
        /// <param name="status">status.</param>
        /// <param name="surname">surname.</param>
        /// <param name="firstName">firstName.</param>
        /// <param name="sex">sex.</param>
        /// <param name="dateOfBirth">dateOfBirth.</param>
        /// <param name="dateOfDeath">dateOfDeath.</param>
        /// <param name="birthPlace">birthPlace.</param>
        public ZwKycVerifyIdResponseEntity(string personNo = default(string), string status = default(string), string surname = default(string), string firstName = default(string), string sex = default(string), string dateOfBirth = default(string), string dateOfDeath = default(string), string birthPlace = default(string))
        {
            this.PersonNo = personNo;
            this.Status = status;
            this.Surname = surname;
            this.FirstName = firstName;
            this.Sex = sex;
            this.DateOfBirth = dateOfBirth;
            this.DateOfDeath = dateOfDeath;
            this.BirthPlace = birthPlace;
        }

        /// <summary>
        /// Gets or Sets PersonNo
        /// </summary>
        [DataMember(Name = "person_no", EmitDefaultValue = false)]
        public string PersonNo { get; set; }

        /// <summary>
        /// Gets or Sets Status
        /// </summary>
        [DataMember(Name = "status", EmitDefaultValue = false)]
        public string Status { get; set; }

        /// <summary>
        /// Gets or Sets Surname
        /// </summary>
        [DataMember(Name = "surname", EmitDefaultValue = false)]
        public string Surname { get; set; }

        /// <summary>
        /// Gets or Sets FirstName
        /// </summary>
        [DataMember(Name = "first_name", EmitDefaultValue = false)]
        public string FirstName { get; set; }

        /// <summary>
        /// Gets or Sets Sex
        /// </summary>
        [DataMember(Name = "sex", EmitDefaultValue = false)]
        public string Sex { get; set; }

        /// <summary>
        /// Gets or Sets DateOfBirth
        /// </summary>
        [DataMember(Name = "date_of_birth", EmitDefaultValue = false)]
        public string DateOfBirth { get; set; }

        /// <summary>
        /// Gets or Sets DateOfDeath
        /// </summary>
        [DataMember(Name = "date_of_death", EmitDefaultValue = true)]
        public string DateOfDeath { get; set; }

        /// <summary>
        /// Gets or Sets BirthPlace
        /// </summary>
        [DataMember(Name = "birth_place", EmitDefaultValue = true)]
        public string BirthPlace { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ZwKycVerifyIdResponseEntity {\n");
            sb.Append("  PersonNo: ").Append(PersonNo).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
            sb.Append("  Surname: ").Append(Surname).Append("\n");
            sb.Append("  FirstName: ").Append(FirstName).Append("\n");
            sb.Append("  Sex: ").Append(Sex).Append("\n");
            sb.Append("  DateOfBirth: ").Append(DateOfBirth).Append("\n");
            sb.Append("  DateOfDeath: ").Append(DateOfDeath).Append("\n");
            sb.Append("  BirthPlace: ").Append(BirthPlace).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as ZwKycVerifyIdResponseEntity);
        }

        /// <summary>
        /// Returns true if ZwKycVerifyIdResponseEntity instances are equal
        /// </summary>
        /// <param name="input">Instance of ZwKycVerifyIdResponseEntity to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ZwKycVerifyIdResponseEntity input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.PersonNo == input.PersonNo ||
                    (this.PersonNo != null &&
                    this.PersonNo.Equals(input.PersonNo))
                ) && 
                (
                    this.Status == input.Status ||
                    (this.Status != null &&
                    this.Status.Equals(input.Status))
                ) && 
                (
                    this.Surname == input.Surname ||
                    (this.Surname != null &&
                    this.Surname.Equals(input.Surname))
                ) && 
                (
                    this.FirstName == input.FirstName ||
                    (this.FirstName != null &&
                    this.FirstName.Equals(input.FirstName))
                ) && 
                (
                    this.Sex == input.Sex ||
                    (this.Sex != null &&
                    this.Sex.Equals(input.Sex))
                ) && 
                (
                    this.DateOfBirth == input.DateOfBirth ||
                    (this.DateOfBirth != null &&
                    this.DateOfBirth.Equals(input.DateOfBirth))
                ) && 
                (
                    this.DateOfDeath == input.DateOfDeath ||
                    (this.DateOfDeath != null &&
                    this.DateOfDeath.Equals(input.DateOfDeath))
                ) && 
                (
                    this.BirthPlace == input.BirthPlace ||
                    (this.BirthPlace != null &&
                    this.BirthPlace.Equals(input.BirthPlace))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.PersonNo != null)
                {
                    hashCode = (hashCode * 59) + this.PersonNo.GetHashCode();
                }
                if (this.Status != null)
                {
                    hashCode = (hashCode * 59) + this.Status.GetHashCode();
                }
                if (this.Surname != null)
                {
                    hashCode = (hashCode * 59) + this.Surname.GetHashCode();
                }
                if (this.FirstName != null)
                {
                    hashCode = (hashCode * 59) + this.FirstName.GetHashCode();
                }
                if (this.Sex != null)
                {
                    hashCode = (hashCode * 59) + this.Sex.GetHashCode();
                }
                if (this.DateOfBirth != null)
                {
                    hashCode = (hashCode * 59) + this.DateOfBirth.GetHashCode();
                }
                if (this.DateOfDeath != null)
                {
                    hashCode = (hashCode * 59) + this.DateOfDeath.GetHashCode();
                }
                if (this.BirthPlace != null)
                {
                    hashCode = (hashCode * 59) + this.BirthPlace.GetHashCode();
                }
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        public IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
